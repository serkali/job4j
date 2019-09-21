package ru.job4j.calculate.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void when3ElementsDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true))
    }

    @Test
    public void when3ElementsDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void when2ElementsDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void when4ElementsDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false, true, false},
                {false, true, false, true},
                {true, false, true, false},
                {false, true, false, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
