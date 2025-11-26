package com.example.sept.machinecoding.tictactoe.controller;

import java.util.List;

import com.example.sept.machinecoding.tictactoe.model.Game;
import com.example.sept.machinecoding.tictactoe.model.GameState;
import com.example.sept.machinecoding.tictactoe.model.Player;

// Stateless class.
    // Their is a concept called as : STATEFUL v/s STATELESS
    // HW: LEARN ABOUT IT....
public class GameController {
    
    // Creates a new Game Object and returns.
    public Game startGame(int dimension, List<Player> players){
        return new Game(dimension, players);
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    /**
     * 
     * 
     * two ways to define business logic:
     * Way-1 : Add BL in your models. This is mostly done in Interative Machine coding Roung.
     *         Where you are not using any DB
     * Way-2: You Add BL in your Service classes. This is mostly done in WEB API Machine coding round.
     *        where you are using a database.
     * 
     * 
     * In this example, we will use Way-1
     */
    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }

    public void displayBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

}
