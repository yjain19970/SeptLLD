package com.example.sept.machinecoding.tictactoe.model;

public class Player {
    private String symbol;
    private String name;
    private Long id;
    private PlayerType playerType;

    public Player(Long id, String name, String symbol, PlayerType type) {
        this.id = id;
        this.playerType = type;
        this.name = name;
        this.symbol = symbol;
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
}