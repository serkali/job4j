package ru.job4j.calculate.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class MiltiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));

    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenAllMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));

    }
    @Test
    public void WhenAllMaxNull(){
        MultiMax check = new MultiMax();
        int result  =check.max(0,0,0);
        assertThat(result, is (0));
    }


}
