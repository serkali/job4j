package ru.job4j.calculate.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1}; //массив монет в автомате
        int[] rsl = new int[100];  //сдача в виде массива монет
        //размер массива rsl , которого он достигнет после того, как автомат отдаст всю сдачу
        int size = 0;
        //money - купюра из кармана;
        //price - цена покупки
        //определяем размер сдачи
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            //условие выдачи сдачи
            while (change - coins[i] >= 0) {
                rsl[size] = coins[i];
                //возвращаем монеты
                change = change - coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
