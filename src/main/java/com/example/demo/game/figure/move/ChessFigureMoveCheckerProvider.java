package com.example.demo.game.figure.move;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.game.board.ChessBoard;
import com.example.demo.game.cell.ChessCell;
import com.example.demo.game.figure.ChessFigureType;
import com.example.demo.game.player.ChessPlayer;

public class ChessFigureMoveCheckerProvider implements ChessFigureMoveChecker {

    private final Map<ChessFigureType, ChessFigureMoveChecker> checkers;

    public ChessFigureMoveCheckerProvider() {
        checkers = new HashMap<>();
        checkers.put(ChessFigureType.PAWN, new PawnMoveChecker());
        checkers.put(ChessFigureType.PAWN, new RookMoveChecker());
        checkers.put(ChessFigureType.PAWN, new HorseMoveChecker());
        checkers.put(ChessFigureType.PAWN, new BishopMoveChecker());
        checkers.put(ChessFigureType.PAWN, new QueenMoveChecker());
        checkers.put(ChessFigureType.PAWN, new KingMoveChecker());
    }

    public ChessFigureMoveCheckerProvider(Map<ChessFigureType, ChessFigureMoveChecker> checkers) {
        this.checkers = checkers;
    }

    @Override
    public boolean canMove(ChessBoard board, ChessPlayer player, ChessMove from, ChessMove to) {
        ChessCell [] [] chessCells = board.getBoard();
        ChessCell chessCell = chessCells [from.getI()] [from.getJ()];
        ChessFigureType chessFigureType = chessCell.getType();
        ChessFigureMoveChecker chessFigureMoveChecker = checkers.getOrDefault(chessFigureType, (b, p, f, t) -> false);

        return chessFigureMoveChecker.canMove(board, player, from, to);
    }
}
