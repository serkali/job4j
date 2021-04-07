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
        return left < right ? right : left; //метод должен возвращать максимальное число из двух чисел

    }

    public int maxLow(int left, int right, int third) {
        return maxLow(third,maxLow(left,right));
    }
    public int maxLow(int left,int right,int third,int four){
        return maxLow(four,maxLow(third,maxLow(left,right)));
    }
}





