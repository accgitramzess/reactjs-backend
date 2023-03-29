package com.example.demo.api;

import com.example.demo.game.util.CONSTANT;

public class CoordinateToArrayIndexConverter {

    private final CoordinateValidator coordinateValidator;

    public CoordinateToArrayIndexConverter(CoordinateValidator coordinateValidator) {
        this.coordinateValidator = coordinateValidator;
    }

    public ArrayIndex convert(Coordinate coordinate) {
        coordinateValidator.validate(coordinate);

        return new ArrayIndex(
                (int) Math.floor(coordinate.getX() / CONSTANT.CELL_WIDTH),
                (int) Math.floor(coordinate.getY() / CONSTANT.CELL_HEIGHT)
        );
    }
}
