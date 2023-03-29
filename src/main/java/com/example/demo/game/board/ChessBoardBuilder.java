package com.example.demo.game.board;

import com.example.demo.game.cell.ChessCell;
import com.example.demo.game.cell.ChessCellColor;
import com.example.demo.game.figure.ChessFigureType;
import com.example.demo.game.util.CONSTANT;

public class ChessBoardBuilder implements IChessBoardBuilder {

    public ChessBoard build() {
        int chessFigureTypeIndex = 0;
        boolean isCellColorWhite = true;
        ChessCell [] [] board = new ChessCell [8] [8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ChessCell chessCell;
                if (i < 2 || i > 5) {
                    chessCell = new ChessCell(
                            isCellColorWhite ? ChessCellColor.WHITE : ChessCellColor.BLACK,
                            CONSTANT.figureType [ chessFigureTypeIndex ]
                    );
                    chessFigureTypeIndex ++;
                } else {
                    chessCell = new ChessCell(
                            isCellColorWhite ? ChessCellColor.WHITE : ChessCellColor.BLACK,
                            ChessFigureType.NONE
                    );
                }
                board [i] [j] = chessCell;
                isCellColorWhite = !isCellColorWhite;
            }
        }

        return new ChessBoard(board);
    }
}
