package com.example.demo;

import com.example.demo.api.Coordinate;
import com.example.demo.api.CoordinateValidator;
import org.junit.jupiter.api.Test;

public class CoordinateValidatorTest {

    @Test
    public void shouldNotThrowException_WhenCoordinateIsValid() {
        CoordinateValidator coordinateValidator = new CoordinateValidator();

        coordinateValidator.validate(new Coordinate(99.5, 55.0));
    }
}
