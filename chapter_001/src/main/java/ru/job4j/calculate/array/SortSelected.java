package ru.job4j.calculate.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); //минимальный элемент
            int index = FindLoop.indexOf(data, min, i, data.length - 1); // индекс минимального элемента
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        //swap(...)
        return data;
    }

}



