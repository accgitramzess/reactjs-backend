package com.example.demo.api;

import com.example.demo.game.util.CONSTANT;

public class CoordinateValidator {

    public void validate(Coordinate coordinate) {
        if (coordinate.getX() < 0.0 || coordinate.getX() > (8 * CONSTANT.CELL_WIDTH)) {
            throw new RuntimeException("Coordinate X is not valid");
        }

        if (coordinate.getY() < 0.0 || coordinate.getY() > (8 * CONSTANT.CELL_HEIGHT)) {
            throw new RuntimeException("Coordinate Y is not valid");
        }
    }
}
