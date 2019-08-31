package ru.job4j.calculate.array;

public class Matrix {
    public int[][] multiple(int size) {
        int table[][] = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table.length; k++) {
                table[i][k] = (k + 1) * (i + 1);

            }
        }
        return table;
    }

}
