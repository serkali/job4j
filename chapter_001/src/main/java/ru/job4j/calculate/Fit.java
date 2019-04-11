package ru.job4j.calculate;

/**
 * Программа расчета идеального веса
 *
 * @author SBAkishev
 * version 1
 */


public class Fit {
    public double manWeight(double height) {
        /**
         * Идеальный вес для мужщины.
         * @param height Рост.
         * @return идеальный вес.
         */
        return (height - 100) * 1.15;

    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

}
