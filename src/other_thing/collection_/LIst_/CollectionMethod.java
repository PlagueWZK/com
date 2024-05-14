package other_thing.collection_.LIst_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("jack");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(true);
        list.remove((Integer)10);
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {  //快捷键itit
            Object i =it.next();
            System.out.println(i);
        }
        for (Object o : list) { //增强for循环的本质仍然是迭代器，系统会在底层自动调用
            System.out.println(o);
            System.out.println(o.getClass());
        }
        for (Object o :list) { //快捷键I
        }
        System.out.println(list.lastIndexOf(2));
    }
}
