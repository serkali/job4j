package ru.job4j.calculate.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data){
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
            }
        }
        for (int i = data.length - 1; i < 0; i--) {
            if (data[i][i] != data[i - 1][i - 1]) {
                result = false;
            }
        }
        return result;
    }
    }

