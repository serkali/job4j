package ru.job4j.calculate.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        Float[] prices = new Float[40];
        String[] names = new String[4];
        names[0] = "Ilon";
        names[1] = "Stiv";
        names[2] = "Mark";
        names[3] = "Bill";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Размер массива равен: " + ages.length + "\n"
                + "Размер массива равен: " + surnames.length + "\n"
                + "Размер массива равен: " + prices.length + "\n");
    }
}
