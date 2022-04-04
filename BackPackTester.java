import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BackPackTester {
    private BackPack backpacker = null;

    @Before
    public void setUp() {
        backpacker = new BackPack();
    }

    @After
    public void tearDown() {
        backpacker = null;
    }

    @Test
    public void test1() {
        int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(11, c[n][m]);
    }

    @Test
    public void test2() {
        int m = 165;
        int n = 10;
        int w[] = {23, 31, 29, 44, 53, 38, 63, 85, 89, 82};
        int p[] = {92, 57, 49, 68, 60, 43, 67, 84, 87, 72};
        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(309, c[n][m]);
    }

    @Test
    public void test3() {
        int m = 10;
        int n = 1;
        int w[] = {11};
        int p[] = {1};
        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(0, c[n][m]);
    }

    @Test
    public void test4() {
        int m = 12;
        int n = 2;
        int w[] = {11, 12};
        int p[] = {11, 12};
        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(12, c[n][m]);
    }

    @Test
    public void test5() {
        int m = 104;
        int n = 8;
        int w[] = {25, 35, 45, 5, 25, 3, 2, 2};
        int p[] = {350, 400, 450, 20, 70, 8, 5, 5};

        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(900, c[n][m]);
    }

    @Test
    public void test6() {
        int m = 2;
        int n = 2;
        int w[] = {1, 2};
        int p[] = {1, 1};
        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(1, c[n][m]);
    }

    @Test
    public void test7() {
        int m = 6404180;
        int n = 24;
        int w[] = {382745, 799601, 909247, 729069, 467902, 44328, 34610, 698150, 823460, 903959, 853665, 551830, 610856, 670702, 488960, 951111, 323046, 446298, 931161, 31385, 496951, 264724, 224916, 169684};
        int p[] = {825594, 1677009, 1676628, 1523970, 943972, 97426, 69666, 1296457, 1679693, 1902996, 1844992, 1049289, 1252836, 1319836, 953277, 2067538, 675367, 853655, 1826027, 65731, 901489, 577243, 466257, 369261};
        int c[][] = backpacker.BackPack_Solution(m, n, w, p);
        assertEquals(13549094, c[n][m]);
    }


}
