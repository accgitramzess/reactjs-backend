package com.example.demo.game.figure.move;

import java.util.Set;
import java.util.function.Predicate;

public interface ChessMoveProvider {

    Set<ChessMove> getMoves(ChessMove currentPosition);
}
