package other_thing.test;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        java.math.BigDecimal decimal1 = new java.math.BigDecimal("3.3698479877777");
        java.math.BigDecimal decimal2 = new java.math.BigDecimal("3.3");
        System.out.println(decimal1.divide(decimal2,BigDecimal.ROUND_CEILING));
    }
}
