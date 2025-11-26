package com.example.sept.machinecoding.tictactoe.strategy;

import com.example.sept.machinecoding.tictactoe.model.Board;
import com.example.sept.machinecoding.tictactoe.model.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board p);
}
