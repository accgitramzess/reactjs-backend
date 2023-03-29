package com.example.demo.game;

import java.util.Objects;

import lombok.AllArgsConstructor;

import com.example.demo.game.board.ChessBoard;
import com.example.demo.game.figure.move.ChessFigureMoveCheckerProvider;
import com.example.demo.game.figure.move.ChessMove;
import com.example.demo.game.player.ChessPlayer;

@AllArgsConstructor
public class Game {
    private final ChessBoard board;
    private final ChessFigureMoveCheckerProvider chessFigureMoveCheckerProvider;
    private ChessPlayer playerWhite;
    private ChessPlayer playerBlack;

    private ChessPlayer current;

    public void join(ChessPlayer player) {
        if (Objects.isNull(playerWhite)) {
            playerWhite = player;
        } else {
            playerBlack = player;
        }

    }

    public void leave(ChessPlayer player) {

    }

    public void move(ChessPlayer player, ChessMove from, ChessMove to) {
        if (this.canMove(board, player, from, to)) {

        } else {

        }
    }

    private boolean canMove(ChessBoard board_, ChessPlayer player, ChessMove from, ChessMove to) {
        return chessFigureMoveCheckerProvider.canMove(board_, player, from, to);
    }
}
