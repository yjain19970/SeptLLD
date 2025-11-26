package com.example.sept.machinecoding.tictactoe;

import com.example.sept.machinecoding.tictactoe.controller.GameController;
import com.example.sept.machinecoding.tictactoe.model.GameState;

public class Main {
    public static void main(String[] args) {
        // This class will Interact with my GameController.

        GameController gameController = new GameController();
        while(gameController.checkGameState().equals(GameState.IN_PROGRESS)){
            /*
             * 
             * DisplayBoard
             * Decide the nextPlayerIndex
             * Ask player to make move
             * 
             * 
             * 
             * Check whether the player has won or not.
             * If the player has won the game, then set the gameState = WIN
             * If the game is DRAWN, then set then set the gameState = DRAW
             * 
             */
        }
    }
}
