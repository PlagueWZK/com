package other_thing.collection_.LIst_;

import java.util.Iterator;
import java.util.LinkedList;


/*
如何选择ArrayList和LinkedList：
1）如果我们改查的操作多，选择ArrayList
2）如果我们增删的操作多，选择LinkedList
3）一般来说，在程序中，80%-90%都是查询，因此大部分情况下会选择ArrayList
4）在一个项目中，根据业务灵活选择，也可能这样，一个模块使用的是ArrayList，另外一个模块是LinkedList，也就是说，要根据业务来进行选择
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        System.out.println(linkedList.remove().getClass()); //remove) 方法会返回删除的元素内容 first.item


        linkedList.add(4);
        System.out.println(linkedList);

        //set 方法进行修改
        linkedList.set(1,999);
        System.out.println(linkedList);

         //遍历
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o :linkedList) {
            System.out.println(o);
        }

    }
}
