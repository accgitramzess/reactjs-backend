package com.example.demo.game.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ChessFigure {

    private final ChessFigureColor color;

    private final ChessFigureType type;
}
