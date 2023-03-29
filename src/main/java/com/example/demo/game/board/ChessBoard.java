package com.example.demo.game.board;

import lombok.AllArgsConstructor;
import lombok.Getter;

import com.example.demo.game.cell.ChessCell;

@AllArgsConstructor
@Getter
public class ChessBoard {

    private final ChessCell [] [] board;
}
