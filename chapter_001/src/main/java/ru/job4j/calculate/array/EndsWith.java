package ru.job4j.calculate.array;

import java.util.Arrays;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        String word1 = new String(word);
        String post2 = new String(post);
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return word1.endsWith(post2);

    }

}