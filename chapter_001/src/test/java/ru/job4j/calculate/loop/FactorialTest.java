package ru.job4j.calculate.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }
        @Test
        public void whenCalculateFactorialForZeroThenOne() {
            Factorial factorial = new Factorial();
            int result = factorial.calc(0);
            assertThat(result, is(1));







    }
}
