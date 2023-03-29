package com.example.demo.game.figure.move;

import com.example.demo.game.board.ChessBoard;
import com.example.demo.game.player.ChessPlayer;

public interface ChessFigureMoveChecker {

    boolean canMove(ChessBoard board, ChessPlayer player, ChessMove from, ChessMove to);
}
