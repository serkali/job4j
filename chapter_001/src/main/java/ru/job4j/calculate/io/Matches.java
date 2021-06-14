package ru.job4j.calculate.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
                turn = !turn;
                //* Остальная логика игры. *//*
                int remainder = count - matches;
                System.out.println("Осталось спичек :" + " " + remainder);
                count = remainder;
            } else {
                System.out.println("Вы ввели неверное число, введите число от 1 до 3");
            }
        }

        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}


