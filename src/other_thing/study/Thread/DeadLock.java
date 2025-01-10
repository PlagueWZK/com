package Test.Thread;

public class DeadLock {
    public static void main(String[] args) {

        //下面的代码将展示死锁
        DeadLockThread A = new DeadLockThread(true);
        DeadLockThread B = new DeadLockThread(false);
        A.setName("A线程");
        B.setName("B线程");
        A.start();
        B.start();
    }
}

class DeadLockThread extends Thread {
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    boolean flag;

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "进入lock1");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "进入lock2");
                }
            }
        }else {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + "进入lock2");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "进入lock1");
                }
            }
        }
    }
}
