package other_thing.study.Generics.A;

import com.plague.math.Fraction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author PlagueWZK
 * description: Solution
 * date: 2024/11/28 18:20
 */

public class Solution {
    public static void main(String[] args) {
        LinkList<Fruit> list = new LinkList<>();
        list.add(new Fruit());
        list.add(new Apple(55));
        list.add(new Banana(20));
        Consumer<Object> action = data -> System.out.println(data + "  " + data.getClass());
        //Consumer<Fruit> action2 = data -> System.out.println(data.getName());
        list.forEach(action);
        //list.forEach2(action); //报错

    }
}
