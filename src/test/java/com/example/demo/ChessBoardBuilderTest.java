package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.game.board.ChessBoard;
import com.example.demo.game.board.ChessBoardBuilder;
import com.example.demo.game.board.ChessBoardVisualViewProvider;

public class ChessBoardBuilderTest {

    private StringBuilder expected = new StringBuilder()
            .append(" R  H  B  K  Q  B  H  R \r\n")
            .append(" P  P  P  P  P  P  P  P \r\n")
            .append(" *  *  *  *  *  *  *  * \r\n")
            .append(" *  *  *  *  *  *  *  * \r\n")
            .append(" *  *  *  *  *  *  *  * \r\n")
            .append(" *  *  *  *  *  *  *  * \r\n")
            .append(" P  P  P  P  P  P  P  P \r\n")
            .append(" R  H  B  K  Q  B  H  R \r\n");

    @Test
    public void test() {
        ChessBoardBuilder chessBoardBuilder = new ChessBoardBuilder();
        ChessBoard chessBoard = chessBoardBuilder.build();
        ChessBoardVisualViewProvider chessBoardVisualViewProvider = new ChessBoardVisualViewProvider();
        StringBuilder actual = chessBoardVisualViewProvider.getChessBoardVisualView(chessBoard);
        System.out.println(expected);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}
