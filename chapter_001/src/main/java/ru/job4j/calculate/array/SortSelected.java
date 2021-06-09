package ru.job4j.calculate.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); //минимальный элемент
            int index = FindLoop.indexOf(data, min, i, data.length - 1); // индекс минимального элемента
            swap(data, i, index);
        }

        //swap(...)
        return data;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

}



