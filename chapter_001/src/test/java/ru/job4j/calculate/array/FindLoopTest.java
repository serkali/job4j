package ru.job4j.calculate.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0(){
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas9Then1(){
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 9, 50};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasThen1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{8, 9, 50};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayNoHas7ThenMinusOne(){
        FindLoop find = new FindLoop();
        int[] input = new int[]{8, 9, 50};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
