package com.example.sept.machinecoding.tictactoe.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.sept.machinecoding.tictactoe.strategy.ColumnWinningStrategy;
import com.example.sept.machinecoding.tictactoe.strategy.DiagonalWinningStrategy;
import com.example.sept.machinecoding.tictactoe.strategy.RowWinningStrategy;
import com.example.sept.machinecoding.tictactoe.strategy.WinningStrategy;

public class Game {
    private List<Player> players;  // Y
    private Board board; // dimension: 
    private List<Move> moves; //    N
    private Player winner; // N 
    private GameState gameState; // N
    private int nextMovePlayerIndex; // N
    private List<WinningStrategy> winningStrategies; // Y
    
    public Game(int dimension,
                List<Player> players){
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = Arrays.asList(new RowWinningStrategy(),
                                    new ColumnWinningStrategy(), 
                                    new DiagonalWinningStrategy());
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }


    public void makeMove() {
        // S1: Get the player using nextPlayerIndex
         Player currentPlayer  = players.get(nextMovePlayerIndex);
         System.out.println("It is Player: "+ currentPlayer.getName() +" move right now.");
         
         // S2: Take Input from the player using Scaner
         // ToDo: If it is a BOT then automatically decide the Input using Strategy here.
         Move currentMove = currentPlayer.getInputAndMakeMove(board);

         // S3: Validate and Update the Cell
         if(invalidMove(currentMove)){
            System.out.println("Invalid move by the player!");
            return;
         }
        
        int currentRow = currentMove.getCell().getRow();
        int currCol = currentMove.getCell().getCol();
        System.out.println("move is made in --> Row: " + currentRow + "col: " + currCol);
         
        Cell currCell =  board.getBoard().get(currentRow).get(currCol);
        currCell.setCellState(CellState.FILLED);
        currCell.setPlayer(currentPlayer);
        
        // S4: Store the move in List<Move>
        Move newMove = new Move(currCell, currentPlayer);
        moves.add(newMove); //  ONLY HERE...
        
        // S5: Calculate next player Index:
        nextMovePlayerIndex +=1;
        nextMovePlayerIndex %= players.size(); // (5/4=1)


        // S6: Check winner.
        if(checkWinner(board, newMove)){
            gameState = GameState.WIN;
            winner = currentPlayer;
        }else if(moves.size() == this.getBoard().getSize()* this.getBoard().getSize()){
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move newMove) {
        for(WinningStrategy wStrategy : winningStrategies){
            if(wStrategy.checkWinner(board, newMove)){
                System.out.println("Check winner returns true : ");
                return true;
            }
        }
        return false;
    }

    // toDo: to implement by own.
    private boolean invalidMove(Move currentMove) {
        /**
         * ToDO: Check for validations...
         *  But you guys will have to handle the validation cases.
         * 1. Row>=0 , Col>=0 && row<n && col <n
         * 2. If the current cell state is NOT EMPTY -- then return true.
         */
        return false;
    }

    public void undo() {
        /**
         * Steps for UNDO:
         * 
         * 1. Get the last move from the moves list
         * 2. Remove the last move from the list.
         * 3. Update the cell status to EMPTY and player to null in CELL.
         * 4. Decreament the lastPlayerIndex
         * 5. handle undo in winning strategy.
         */

        if(moves.size()==0){
            System.out.println("No moves made yet.");
            return;
        }
        if(!gameState.equals(GameState.IN_PROGRESS)){
            System.out.println("Game is not in Progress.");
            return;
        }

        Move lastMove = moves.get(moves.size()-1);
        moves.remove(lastMove);

        nextMovePlayerIndex -= 1;
        nextMovePlayerIndex = (nextMovePlayerIndex + players.size())%players.size();


        // Last part to reduce the count as well.
        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(board, lastMove);
        }

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setPlayer(null);
    }

    public void printBoard(){
        board.printBoard();
    }

    
}
