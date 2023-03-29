package com.example.demo.game.figure.move;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ChessMove {

    private int i;

    private int j;

    @Override
    public boolean equals(Object obj) {
        if (Objects.isNull(obj)) {
            return false;
        }
        ChessMove chessMove = (ChessMove) obj;

        return chessMove.getI() == i && chessMove.getJ() == j;
    }
}
