package SlidingWindow;

import java.util.ArrayList;

public class DataStream {

    private int i = 0, j = 0, count = 0, value, k;
    private ArrayList<Integer> ip;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.ip = new ArrayList<>();
    }

    public boolean consec(int num) {
        ip.add(num);

        if (ip.get(j) == value) {
            count++;
        }

        if (j - i + 1 < k) {
            j++;
            return false;
        } else {
            boolean result = (count == k);
            if (ip.get(i) == value) count--;
            i++;
            j++;
            return result;
        }
    }

    public static void main(String[] args) {
        DataStream stream = new DataStream(4, 3);
        System.out.println(stream.consec(4)); // false
        System.out.println(stream.consec(4)); // false
        System.out.println(stream.consec(4)); // true
        System.out.println(stream.consec(3)); // false
    }
}
