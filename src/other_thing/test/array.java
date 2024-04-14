package other_thing.test;

import java.util.Arrays;
import java.util.Comparator;

public class array {
    public static void main(String[] args) {

        Double[] Doubles = {2.4,639d,-73d,0d};
        Arrays.sort(Doubles, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return 0;
            }
        });
        System.out.println(Arrays.toString(Doubles));
    }
}


