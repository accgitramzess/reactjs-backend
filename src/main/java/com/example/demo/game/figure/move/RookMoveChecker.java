package com.example.demo.game.figure.move;

import com.example.demo.game.board.ChessBoard;
import com.example.demo.game.player.ChessPlayer;

public class RookMoveChecker implements ChessFigureMoveChecker {

    @Override
    public boolean canMove(ChessBoard board, ChessPlayer player, ChessMove from, ChessMove to) {
        return false;
    }
}
