package com.example.demo.game.figure.move;

import com.example.demo.game.board.ChessBoard;
import com.example.demo.game.cell.ChessCell;
import com.example.demo.game.figure.ChessFigureType;
import com.example.demo.game.player.ChessPlayer;

public class PawnMoveChecker implements ChessFigureMoveChecker {

    @Override
    public boolean canMove(ChessBoard board, ChessPlayer player, ChessMove from, ChessMove to) {
        ChessCell [] [] b = board.getBoard();
        ChessCell f = b [from.getI()] [from.getJ()];

        return false;
    }

    private boolean isSingleMove(ChessMove from, ChessMove to) {
        if (from.getI() + 1 == to.getI() || from.getI() - 1 == to.getI()) {
            return true;
        }

        return false;
    }

    private boolean isDoubleMove(ChessMove from, ChessMove to) {
        if (from.getI() == 6 || from.getI() == 1) {
            if (to.getI() == 4 || to.getI() == 3) {
                ChessCell t = b [from.getI()] [from.getJ()];
                if (t.getType() == ChessFigureType.NONE) { // is Cell Empty
                    t.setType(f.getType());

                    return true;
                }
            }
        }

        return false;
    }

    private boolean isAttack(ChessMove from, ChessMove to) {
        ChessMove leftDown = new ChessMove(from.getI() - 1, from.getJ() - 1); // left
        ChessMove rightDown = new ChessMove(from.getI() - 1, from.getJ() + 1); // right
        if (to.equals(leftDown) || to.equals(rightDown)) {
            return true;
        }

        ChessMove leftUp = new ChessMove(from.getI() + 1, from.getJ() - 1); // left
        ChessMove rightUp = new ChessMove(from.getI() + 1, from.getJ() + 1); // right
        if (to.equals(leftUp) || to.equals(rightUp)) {
            return true;
        }

        return false;
    }
}
