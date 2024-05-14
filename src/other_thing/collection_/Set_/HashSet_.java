package other_thing.collection_.Set_;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(2));
        System.out.println(hashSet.add(3));
        System.out.println(hashSet.add(3)); // 如果添加成功则会返回true 失败则返回false
        int count = 0;
        while (count++ <= 100000) {
            System.out.print("0b");
        }
    }
}
