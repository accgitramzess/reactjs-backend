package com.example.demo.game.history;

import lombok.AllArgsConstructor;

import com.example.demo.game.figure.move.ChessMove;
import com.example.demo.game.player.ChessPlayer;

@AllArgsConstructor
public class ChessHistorySegment {

    private final int order;

    private final ChessPlayer player;

    private final ChessMove from;

    private final ChessMove to;
}
