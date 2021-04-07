package ru.job4j.calculate.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point(0,0);
        Point point1 = new Point(0,2);
        double result = point.distance(point1);

        assertThat(result, is(2.0));
    }
    @Test
    public void test3dPoint(){
        Point point = new Point(0,0,0);
        Point point1 = new Point(0,2,2);
        double result = point.distance3d(point1);
        assertThat(result,is(2.8284271247461903));

    }
}
