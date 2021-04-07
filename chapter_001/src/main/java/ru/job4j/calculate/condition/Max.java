package ru.job4j.calculate.condition;

/**
 * @author SBakishev
 * vesion 1
 */


public class Max {
    /**
     * @param left
     * @param right
     * @return
     */
    public int maxLow(int left, int right) {
        int result = left - right < 0 ? right : left; //метод должен возвращать максимальное число из двух чисел
        return result;
    }

    public int maxLow(int left, int right, int third) {
        int tmp = maxLow(left, right);
        return third > tmp ? third : tmp;
    }
}





