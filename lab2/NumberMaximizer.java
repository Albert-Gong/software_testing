package lab2;

public class NumberMaximizer {

    public NumberMaximizer() {}

    public int maximum(int u) {
        if (u == 1 || u == 2) return 1;
        else if (u == 3) return 2;

        int num = u / 3;
        if (u % 3 == 0) return factorial(3, num);
        else if (u % 3 == 1) return factorial(3, num - 1) * 4;
        else return factorial(3, num) * 2;

    }

    private int factorial(int u, int t) {
        int x = 1;
        for (int i = 1; i <= t; i++) x *= u;
        return x;
    }
}
