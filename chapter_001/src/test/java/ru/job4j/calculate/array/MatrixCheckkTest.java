package ru.job4j.calculate.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckkTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheckk.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheckk.monoVertical(input, column);
        Assert.assertTrue(result);
    }
}
