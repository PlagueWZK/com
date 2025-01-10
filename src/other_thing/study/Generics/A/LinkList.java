package other_thing.study.Generics.A;

import java.util.function.Consumer;

/**
 * @author PlagueWZK
 * description: LinkList
 * date: 2024/11/28 18:11
 */

public class LinkList<T> {
    private Node<T> first;
    private int size;
    public LinkList() {
        this.first = null;
        size = 0;
    }
    public Node<T> getFirst() {
        return first;
    }
    public void setFirst(Node<T> first) {
        this.first = first;
    }
    public int getSize() {
        return size;
    }
    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (first == null) {
            first = node;
        } else {
            Node<T> last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        size++;
    }
    public void forEach(Consumer<? super T> action) {
        Node<T> node = first;
        while (node != null) {
            action.accept(node.getData());
            node = node.getNext();
        }
    }

    public void forEach2(Consumer<T> action2) {
        Node<T> node = first;
        while (node != null) {
            action2.accept(node.getData());
            node = node.getNext();
        }
    }
}
