package ru.job4j.calculate.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
