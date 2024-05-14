package other_thing.collection_.Set_;

import java.util.HashSet;
import java.util.Set;

public class SetInterface_ {

    /*
    Set接口基本介绍
    1)无序（添加和取出的顺序不一致），没有索引
    2)不允许重复元素，所以最多包含一个null
    3）JDK API中Set接口的实现类有：HashSet,TreeSet,AbstractSet...还有很多!
    4)遍历方式：①使用迭代器②增强for循环
            ！！不能使用索引
     */
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add("jack");
        set.add("45");
        System.out.println(set);
    }
}
