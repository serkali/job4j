package ru.job4j.calculate.condition;
/**
 * @author SBakishev
 * @version 1
 */

import org.junit.Test;

import static java.lang.Math.max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        Max max = new Max();
        int result = max(2, 1);
        assertThat(result, is(2));

    }

    @Test
    public void whenMax2To2Then2() {
        Max max = new Max();
        int result = max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3number() {
        Max max = new Max();
        int tmp = max.maxLow(2, 2, 3);
        assertThat(tmp, is(3));
    }
    @Test
    public void whenMax4Number(){
        Max max = new Max();
        int tmp = max.maxLow(1,2,3,4);
        assertThat(tmp,is(4));
    }
}