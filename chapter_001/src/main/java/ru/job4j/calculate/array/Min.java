package ru.job4j.calculate.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
            if (min > index) {
                min = array[index];
            }
        }
        return min;
    }
}
