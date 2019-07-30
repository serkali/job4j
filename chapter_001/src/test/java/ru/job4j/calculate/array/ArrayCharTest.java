package ru.job4j.calculate.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.Startswith("Hello", "He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.Startswith("Hello", "Hi");
        assertThat(result, is(false));
    }
}
