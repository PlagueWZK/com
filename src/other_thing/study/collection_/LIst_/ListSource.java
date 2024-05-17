package other_thing.study.collection_.LIst_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@SuppressWarnings({"all"})
public class ListSource {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        System.out.println(list);
        System.out.println(list.size());
        Boolean[] booleans = new Boolean[3];
        System.out.println(Arrays.toString(booleans));
    }
}
