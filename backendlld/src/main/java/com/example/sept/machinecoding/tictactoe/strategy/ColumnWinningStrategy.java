package com.example.sept.machinecoding.tictactoe.strategy;

import java.util.HashMap;
import java.util.Map;

import com.example.sept.machinecoding.tictactoe.model.Board;
import com.example.sept.machinecoding.tictactoe.model.Move;

public class ColumnWinningStrategy implements WinningStrategy {
    // The HashMap to keep a Count.
    private Map<Integer, HashMap<String, Integer>> counts = new HashMap<>();
    // <RowNumber, Map<Symbol, Count>>
    // <0: <k,V> >
    // <1: {<X, 1>, <O:2>}>

    @Override
    public boolean checkWinner(Board board, Move move) {
        int colNo = move.getCell().getCol();
        String symbol = move.getPlayer().getSymbol();

        if(!counts.containsKey(colNo)){
            counts.put(colNo, new HashMap<>());
        }

        Map<String,Integer> individualColMap = counts.get(colNo); // get from existing hashmap.

        if(!individualColMap.containsKey(symbol)){
            individualColMap.put(symbol, 0);
        }

        individualColMap.put(symbol, individualColMap.get(symbol)+1); // increamenting.

        // Win check. 
        if(individualColMap.get(symbol).equals(board.getSize())){
            return true;
        }
        return false;        
    }

    /*

     R1: {X:2,O:1}
     R2: {X:1,O:0}

    
    
    */
    @Override
    public void handleUndo(Board board, Move move) {
        int colNo = move.getCell().getCol();
        String symbol = move.getCell().getPlayer().getSymbol();
        Map<String,Integer> internalMap = counts.get(colNo);

        internalMap.put(symbol, internalMap.get(symbol)-1);
    }
    
}
