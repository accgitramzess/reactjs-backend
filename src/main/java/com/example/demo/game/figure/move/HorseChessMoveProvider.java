package com.example.demo.game.figure.move;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class HorseChessMoveProvider implements ChessMoveProvider {

    private Set<Predicate<ChessMove>> predicates = new HashSet<>();

    public HorseChessMoveProvider() {
        predicates.add((chessMove) -> chessMove.getI() - 2 >= 0 || chessMove.getJ() - 1 >= 0);
        predicates.add((chessMove) -> chessMove.getI() - 2 >= 0 || chessMove.getJ() + 1 <= 7);
        predicates.add((chessMove) -> chessMove.getI() + 2 <= 7 || chessMove.getJ() - 1 >= 0);
        predicates.add((chessMove) -> chessMove.getI() + 2 <= 7 || chessMove.getJ() + 1 <= 7);
    }

    @Override
    public Set<ChessMove> getMoves(ChessMove currentPosition) {
        int i = currentPosition.getI();
        int j = currentPosition.getJ();

        Set<ChessMove> availableMoves = new HashSet<>();

        predicates.forEach(predicate -> {
            if (predicate.test(currentPosition)) {
                availableMoves.add(new ChessMove(i - 2, j - 1));
            }
        });

        return availableMoves;
    }
}
