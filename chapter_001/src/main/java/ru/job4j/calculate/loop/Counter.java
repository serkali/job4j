package ru.job4j.calculate.loop;

/**
 * @author SBakishev
 * @version1
 *
 */


public class Counter {
    /**
     * @param start
     * @param finish
     * @return sum
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) { //цикл увеличивает переменную на единицу в диапозоне от start до finish
            if ((i % 2) == 0) { // проверяет четное ли число
                sum += i;
            }
        }
        return sum;
    }
}
