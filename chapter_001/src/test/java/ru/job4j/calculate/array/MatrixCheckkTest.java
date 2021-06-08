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
}
