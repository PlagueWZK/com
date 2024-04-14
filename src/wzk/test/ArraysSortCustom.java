package wzk.test;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] a = {0,-1,10,20,-90,100};
        bubbleSort(a, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a = (Integer) o1;
                int b = (Integer) o2;
                return b-a;
            }
        });
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] arr, Comparator c) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j],arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = temp;
                }
            }
        }
    }
}
