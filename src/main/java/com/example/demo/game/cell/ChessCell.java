package com.example.demo.game.cell;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.example.demo.game.figure.ChessFigureType;

@AllArgsConstructor
@Getter
@Setter
public class ChessCell {

    private ChessCellColor color;

    private ChessFigureType type;
}
