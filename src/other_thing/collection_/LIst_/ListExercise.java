package other_thing.collection_.LIst_;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings({"all"})
public class ListExercise {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义",45,"lgz"));
        list.add(new Book("三国演",85,"gz"));
        list.add(new Book("三国义",15,"z"));
        for (Object o :list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println(list);
    }
    public static void sort(List list){
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (((Book)list.get(j)).getPrice() > ((Book)list.get(j + 1)).getPrice()) {
                    Book temp = (Book)list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
}
class Book {
    private String name;
    private int price;
    private String author;

    @Override
    public String toString() {
        return name+"\t"+author+"\t"+price;
    }

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
