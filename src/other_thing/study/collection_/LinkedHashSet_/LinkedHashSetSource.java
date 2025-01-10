package other_thing.study.collection_.LinkedHashSet_;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(1);
        set.add("jack");
        set.add(2);
        set.add(34);
        set.add(34);
        System.out.println(set);
        for (Iterator i = set.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
/*
LinkedHashSet的全面说明
1)LinkedHashSet是HashSet的子类
2）LinkedHashSet底层是一个LinkedHashMap，底层维护了一个数组+双向链表
3）LinkedHashSet根据元素的hashCode值来决定元素的存储位置，同时使用链表维护元素的次序（图），这使得元素看起来是以插入顺序保存的。
4)LinkedHashSet不允许添重复元素

说明
1）在LinkedHastSet中维护了一个hash表和双向链表（LinkedHashSet有head和 tail）
2）每一个节点有before和after属性，这样可以形成双向链表
3）在添加一个元素时，先求hash值，在求索引，确定该元素在table的位置，然后将添加的元素加入到双向链表（如果已存在，不添加[原则和hashset一样]）
4）这样的话，我们遍历LinkedHashSet也能确保插入顺序和遍历顺序一致(有顺序)
 */