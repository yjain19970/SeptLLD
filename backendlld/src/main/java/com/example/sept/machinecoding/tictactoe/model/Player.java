package com.example.sept.machinecoding.tictactoe.model;

import java.util.Scanner;

public class Player {
    private String symbol;
    private String name;
    private Long id;
    private PlayerType playerType;
    private Scanner scanner;

    public Player(Long id, String name, String symbol, PlayerType type) {
        this.id = id;
        this.playerType = type;
        this.name = name;
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);
    }

    
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public PlayerType getPlayerType() {
        return playerType;
    }
    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move getInputAndMakeMove(Board board) {
        if(this.playerType.equals(PlayerType.BOT)){
            // On the basis of difficulty level, you call and return the 
            // response from bot playing strategy.
            
        }
        System.out.println("Please tell row: ");
        int row = scanner.nextInt();

        System.out.println("Please tell col: ");
        int col = scanner.nextInt();
        // Validation here as well...
        return new Move(new Cell(row, col), this);
    }    

}