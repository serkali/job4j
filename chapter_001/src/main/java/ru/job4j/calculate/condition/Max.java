package ru.job4j.calculate.condition;

public class Max {
    public int maxLow(int left, int right) {
        int result = left - right < 0 ? right : left;
        return result;


    }
}





