package lab1;

import java.util.LinkedList;
import java.util.List;

public class Pocket {
    private List<Integer> pocket;

    public Pocket() {
        /*
         * deem every bill as a different item with a certan value
         * as a result, use a list as the container
         * */
        this.pocket = new LinkedList<>();
        this.pocket.add(50);
        this.pocket.add(20);
        this.pocket.add(10);
        this.pocket.add(5);
        this.pocket.add(5);
        this.pocket.add(1);
        this.pocket.add(1);
        this.pocket.add(1);

    }

    /*
     * x may be invalid. For example, x is -1 or 5.1.
     * However, 5 or 5.0 are both valid numbers.
     * as a result, the input x is a double.
     * */
    public boolean charge(int x) {
        /*
         * not possible to handle a negative number
         * */
        if (x < 0) return false;
        /*
         * deem 0 as a valid number as well
         * */
        else if (x == 0) return true;

        int index = 0;
        int fee = x;
        /*
         * use a greedy method to find out whether x is a valid number
         * */
        while (index < this.pocket.size()) {
            int value = this.pocket.get(index);
            if (fee >= value) {
                fee -= value;
                if (fee == 0) return true;
            }
            index++;
        }
        return false;
    }

}
