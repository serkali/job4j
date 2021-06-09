package ru.job4j.calculate.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortZero() {
        int[] data = new int[]{5, 0, 2, 4, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortNegative() {
        int[] data = new int[]{0, 2, -1, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-1, 0, 1, 2};
        Assert.assertArrayEquals(expected, result);
    }

}
