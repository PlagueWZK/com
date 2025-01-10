package Test.Thread;

public class Method {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        a.setPriority(Thread.MIN_PRIORITY);
        a.interrupt();//当进程处于休眠状态时执行interrupted方法会提前终止休眠并被catch到异常
    }
}

class A extends Thread {
    private int num;
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()+" is running" +" "+ ++num);

        }
    }
}