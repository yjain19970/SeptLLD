package com.example.sept.machinecoding.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.sept.machinecoding.tictactoe.controller.GameController;
import com.example.sept.machinecoding.tictactoe.model.Game;
import com.example.sept.machinecoding.tictactoe.model.GameState;
import com.example.sept.machinecoding.tictactoe.model.Player;
import com.example.sept.machinecoding.tictactoe.model.PlayerType;

/*
 * This is your client class...
 * 
 */
public class Driver {
    public static void main(String[] args) {
        // This class will Interact with my GameController.
        try{
            int dimension = 3; // HARD CODE IT FOR NOW.
            List<Player> players = new ArrayList<>();
            players.add(new Player(1L, "Yash", "X", PlayerType.HUMAN));
            players.add(new Player(2L, "Bot", "O", PlayerType.HUMAN));


            GameController gameController = new GameController();
            Game game =  gameController.startGame(dimension, players);
            //Scanner scanner = new Scanner(System.in); // DISCUSS THIS LAYER.
            while(gameController.checkGameState(game).equals(GameState.IN_PROGRESS)){
                gameController.displayBoard(game);
                System.out.println("Please make a move....");
                gameController.makeMove(game);
            }

            System.out.println("Game is FINISHED. ");
            if(gameController.checkGameState(game).equals(GameState.WIN)){
                System.out.println("Game is WON by Player:  " + gameController.getWinner(game));
            }else{
                System.out.println("Game has been DRAWN.");
            }
        }catch(Exception e){
            System.out.println("Exception happened: " + e.getStackTrace());
        }
    }
}
