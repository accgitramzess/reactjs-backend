package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.api.ArrayIndex;
import com.example.demo.api.Coordinate;
import com.example.demo.api.CoordinateToArrayIndexConverter;
import com.example.demo.api.CoordinateValidator;

public class CoordinateToArrayArrayIndexConverterTest {

    @Test
    public void shouldReturnValidArrayIndex_WhenCoordinateIsValid() {
        CoordinateToArrayIndexConverter converter = new CoordinateToArrayIndexConverter(new CoordinateValidator());

        ArrayIndex arrayIndex = converter.convert(new Coordinate(99.5, 55.0));

        Assertions.assertEquals(0, arrayIndex.getI());
        Assertions.assertEquals(0, arrayIndex.getJ());
    }

    @Test
    public void shouldReturnValidArrayIndex_WhenCoordinateIsValid2() {
        CoordinateToArrayIndexConverter converter = new CoordinateToArrayIndexConverter(new CoordinateValidator());

        ArrayIndex arrayIndex = converter.convert(new Coordinate(777.5, 55.0));

        Assertions.assertEquals(7, arrayIndex.getI());
        Assertions.assertEquals(0, arrayIndex.getJ());
    }
}
