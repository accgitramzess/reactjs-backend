package com.example.demo.game.board;

import com.example.demo.game.cell.ChessCell;
import com.example.demo.game.figure.ChessFigureType;

public class ChessBoardVisualViewProvider {

    public StringBuilder getChessBoardVisualView(ChessBoard chessBoard) {
        StringBuilder chessBoardVisualView = new StringBuilder();
        ChessCell [] [] board = chessBoard.getBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].getType() == ChessFigureType.NONE) {
                    chessBoardVisualView.append(" * ");
                } else {
                    chessBoardVisualView
                            .append(" ")
                            .append(board[i][j].getType().name().charAt(0))
                            .append(" ");
                }
            }
            chessBoardVisualView.append("\r\n");
        }

        return chessBoardVisualView;
    }
}
