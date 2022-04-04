package lab1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PocketTester {
    private Pocket pocket;
    private int input;
    private boolean expected;

    public PocketTester(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        this.pocket = new Pocket();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
                {94, false},
                {93, true},
                {92, true},
                {89, false},
                {87, true},
                {75, true},
                {39, false},
                {22, true},
                {15, true},
                {3, true},
                {1, true},
                {0, true},
        });
    }

    @Test
    public void test_charge() {
        assertEquals(this.expected, this.pocket.charge(this.input));
    }

}
