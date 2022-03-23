import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTester {
    private BubbleSort bubbleSorter = null;

    @Before
    public void setUp() {
        bubbleSorter = new BubbleSort();
    }

    @After
    public void tearDown() {
        bubbleSorter = null;
    }

    @Test
    public void test1() {
        int input1[] = new int[]{};
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(bubbleSorter.BubbleSort(input1)));
    }

    @Test
    public void test2() {
        int input2[] = new int[]{1};
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(bubbleSorter.BubbleSort(input2)));
    }

    @Test
    public void test3() {
        int input3[] = new int[]{1, 1};
        assertEquals(Arrays.toString(new int[]{1, 1}), Arrays.toString(bubbleSorter.BubbleSort(input3)));
    }

    @Test
    public void test4() {
        int input4[] = new int[]{1, 3};
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(bubbleSorter.BubbleSort(input4)));

    }

    @Test
    public void test5() {
        int input5[] = new int[]{4, 1};
        assertEquals(Arrays.toString(new int[]{1, 4}), Arrays.toString(bubbleSorter.BubbleSort(input5)));

    }

    @Test
    public void test6() {
        int input6[] = new int[]{1, 2, 1};
        assertEquals(Arrays.toString(new int[]{1, 1, 2}), Arrays.toString(bubbleSorter.BubbleSort(input6)));

    }

    @Test
    public void test7() {
        int input7[] = new int[]{2, 1, 1, 3};
        assertEquals(Arrays.toString(new int[]{1, 1, 2, 3}), Arrays.toString(bubbleSorter.BubbleSort(input7)));

    }

    @Test
    public void test8() {
        int input8[] = new int[]{3, 3, 2, 2, 1, 1};
        assertEquals(Arrays.toString(new int[]{1, 1, 2, 2, 3, 3}), Arrays.toString(bubbleSorter.BubbleSort(input8)));

    }

    @Test
    public void test9() {
        int input9[] = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}), Arrays.toString(bubbleSorter.BubbleSort(input9)));

    }

    @Test
    public void test10() {
        int input10[] = new int[]{1, 6, 2, 5, 3, 4};
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}), Arrays.toString(bubbleSorter.BubbleSort(input10)));

    }

    @Test
    public void test11() {
        int input11[] = new int[]{1, 2, 3, 4, 5, -6};
        assertEquals(Arrays.toString(new int[]{-6, 1, 2, 3, 4, 5}), Arrays.toString(bubbleSorter.BubbleSort(input11)));
    }

}
