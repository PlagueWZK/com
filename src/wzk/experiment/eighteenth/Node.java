package wzk.experiment.eighteenth;

import java.io.*;

/**
 * @author PlagueWZK
 * description: Node
 * date: 2025/1/2 21:30
 */

public class Node implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int data;

    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }

    public Node(int data) {
        this.data = data;   
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public static void main(String[] args) {
        String filePath = "D:\\Mything\\MyProgram\\JAVA\\com\\src\\wzk\\experiment\\eighteenth\\node.ser"; // 序列化文件路径

        Node node = new Node(25);

        serialize(node, filePath);

        Node des = deserializePerson(filePath);

        System.out.println("反序列化后的对象：" + des);
    }

    public static void serialize(Node person, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(person);
            System.out.println("对象序列化成功：" + person);
        } catch (IOException e) {
            System.err.println("序列化失败：" + e.getMessage());
        }
    }

    // 反序列化方法
    public static Node deserializePerson(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Node) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("反序列化失败：" + e.getMessage());
            return null;
        }
    }
}
