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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeMove'");
    }

    public void undo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }

    public void printBoard(){
        
    }

    
}
