package ru.job4j.calculate.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
            int result = first;
            result= first>second?first:second;
            return result>third?result:third
    }


}
