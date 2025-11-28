package com.example.sept.machinecoding.tictactoe.strategy;

import com.example.sept.machinecoding.tictactoe.model.Board;
import com.example.sept.machinecoding.tictactoe.model.Move;

public class DiagonalWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, Move move) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'checkWinner'");
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
    }
    
}
