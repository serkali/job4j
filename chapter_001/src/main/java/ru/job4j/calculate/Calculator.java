package ru.job4j.calculate;

/**
 * Элементарный калькулятор
 *
 * @author SBakishev
 * version 1
 */
public class Calculator {
    /**
     * Method сложение
     *
     * @param first
     * @param second
     * @return
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method вычитание
     *
     * @param first
     * @param second
     * @return
     */
    public double subtract(double first, double second) {
        return first - second;

    }

    /**
     * Method деление
     *
     * @param first
     * @param second
     * @return
     */
    public double div(double first, double second) {
        return first / second;


    }

    /**
     * Мethof умножения
     *
     * @param first
     * @param second
     * @return
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}

