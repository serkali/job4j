package ru.job4j.calculate.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        Float[] prices = new Float[40];
        System.out.println("Размер массива равен: " + ages.length + "\n"
        + "Размер массива равен: " + surnames.length + "\n"
        + "Размер массива равен: " + prices.length + "\n");
    }
}
