package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        ru.job4j.calculate.Calculator calc = new ru.job4j.calculate.Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneMinusOneThenTwo() {
        ru.job4j.calculate.Calculator calc = new ru.job4j.calculate.Calculator();
        double result = calc.subtract(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivOneDivOneThenTwo() {
        ru.job4j.calculate.Calculator calc = new ru.job4j.calculate.Calculator();
        double result = calc.div(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleOneMultipleOneThenTwo() {
        ru.job4j.calculate.Calculator calc = new ru.job4j.calculate.Calculator();
        double result = calc.multiple(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

}


