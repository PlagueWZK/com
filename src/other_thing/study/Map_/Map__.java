package other_thing.study.Map_;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
1.Map和Collection并列存在，保存映射关系Key-Value(双列元素)
2.Map中的key和value可以是任何引用类型的数据，会封装到
HashMap$Node（静态内部类）对象中
3.Map中key不允许重复，原因和HashSet一样。当有相同的key时会替换
4.value可以重复
5.key和value都可以为null（key只允许有一个null，因为不可重复）
6.常用String做key
7.key和value存在单向一对一对应关系，通过指定的key总能找到对应的value
 */
public class Map__ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("01","A");
        map.put("02","B");
        System.out.println(map);
        map.put(1,"C");
        Set set = map.entrySet();System.out.println(set.getClass());//HashMap$EntrySet
        for (Object entry : set){
            System.out.println(entry.getClass()); //HashMap$Node
        }
    }
}
//老韩解读
// 1。k-v 最后是 HashMap$Node node = newNode(hash, key， value, nulL)
// 2。k-V 为了方便程序员的遍历，还会 创建 EntrySet 集合，该集合存放的元素的类型 Entry，而一个Entry对象就有k,v EntrySet<Entry<K,V>> 即：transient Set<Map.Entry<K,V>> entrySet;
// 3。entrySet 中，定义的类型是 Map.Entry，但是实际上存放的还是 HashMap$Node
//这是因为 static class Node<K,V> implements Map.Entry<K,V>实现了接口