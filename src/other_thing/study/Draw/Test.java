package Test.Draw;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Thread t1 = new Thread(d);
        t1.start();
    }
}

class Dog implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("HI"+(++count)+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}