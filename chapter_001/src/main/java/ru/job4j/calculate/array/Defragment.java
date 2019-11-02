package ru.job4j.calculate.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                String tmp = array[index];
                int indextmp = index;
                while (indextmp < array.length) {
                    String celltmp = array[indextmp];
                    if (celltmp != null) {
                        String tmp1 = array[indextmp];
                        array[index] = tmp1;
                        array[indextmp] = tmp;
                        break;
                    }
                    indextmp++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}