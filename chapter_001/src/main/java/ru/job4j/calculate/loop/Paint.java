package ru.job4j.calculate.loop;

/**
 * @author SBakishev
 * @version 1
 * @since 0.1
 */

public class Paint {
    public String rightTrl(int height) {
        StringBuilder scrren = new StringBuilder(); // буфер для результата
        int weight = height; //ширина будет равна высоте
        for (int row = 0; row != height; row++) {    //внешний цикл двигается по строкам
            for (int column = 0; column != weight; column++) {  // внутренний цикл определяет положение ячейки в строке
                // если строка равна ячейке то рисуем галку
                // в данном случае строка определяет сколько ячеек будет в строке
                if (row >= column) {
                    scrren.append("^");
                } else {
                    scrren.append(" ");
                }
            }
            scrren.append(System.lineSeparator()); //добавляем перевод строки
        }
        return scrren.toString();

    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
                screen.append(System.lineSeparator());
            }
        }
        return screen.toString();
    }
}

