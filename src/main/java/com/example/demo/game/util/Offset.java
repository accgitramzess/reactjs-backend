package com.example.demo.game.util;

import com.example.demo.game.figure.move.ChessMove;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Predicate;

@AllArgsConstructor
@Getter
public class Offset {

    private final int i;

    private final int j;

    private final Predicate<ChessMove> predicate;
}
