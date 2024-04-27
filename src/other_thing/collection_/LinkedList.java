package other_thing.collection_;

public class LinkedList {
    public static void main(String[] args) {
        Node tom = new Node(1);
        Node jan = new Node(2);
        Node wzr = new Node(3);
        tom.next = jan;
        jan.next = wzr;
        wzr.pre = jan;
        jan.pre = tom;
        Node first = tom;
        Node last = wzr;
        while (first != null) {
            System.out.println(first.data);
            first = first.next;
        }
    }
}



class Node {
    public Object data;
    public Node next;
    public Node pre;
    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}