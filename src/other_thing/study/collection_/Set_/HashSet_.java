package other_thing.study.collection_.Set_;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(2));
        System.out.println(hashSet.add(3));
        System.out.println(hashSet.add(3)); // 如果添加成功则会返回true 失败则返回false
        /*HashSet特点
            ①不包括重复数值
            ②非同步
            ③元素无序
            ④允许NULL元素
          添加元素底层逻辑:1.先获取元素的哈希值（hashCode方法)
          2.对哈希值进行运算，得出一个索引值即为要存放在哈希表中的位置号
          3.如果该位置上没有其他元素，则直接存放如果该位置上已经有其他元素，则需要进行equals()判断，
          如果相等，则不再添加。如果不相等则以链表的方式添加。

          1.HashSet底层是HashMap
          2.添加一个元素时，先得到hash值-会转成->索引值
          3.找到存储数据表table，看这个索引位置是否已经存放的有元素
          4.如果没有，直接加入
          5.如果有，调用月equals()比较，如果相同，就放弃添加，如果不相同，则添加到最后
          6.在Java8中，如果一条链表的元素个数到达TREEIFY_THRESHOLD默认是8），并且table的大小>=MIN_TREEIFY_CAPACITY（默认64）
          就会进行树化（红黑树）
         */
        System.out.println(hashSet);


        /*
        扩容机制:
        1.HashSet底层是HashMap，第一次添加时，table数组扩容到16，临界值（threshold）是16*加载因子(loadFactor）是0.75=12
        2.如果table数组使用到了临界值12，就会扩容到16＊2=32，新的临界值就是32*0.75=24，依次类推
        3.在Java8中，如果一条链表的元素个数到达TREEIFYTHRESHOLD（默认是8），并且table的大小>=MINTREEIFY_CAPACITY（默认64），
        就会进行树化（红黑树），否则仍然采用数组扩容机制
         */

        //树化演示:
        HashSet hashSet1 = new HashSet();
        for(int i = 0;i <= 12; i++) {
            hashSet1.add(new A(i));
        }
    }
}
/*
    由于添加的A对象会获得哈希值，通过重写hashCode方法使返回的hashCode相同，从而使计算获得的索引值相同，使添加的对象都放入同一个数组索引
    之后形成链表形式
    当达到树化条件形成红黑树
 */

class A {
    private int n;
    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
