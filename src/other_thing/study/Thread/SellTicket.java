package Test.Thread;

public class SellTicket {
    public static void main(String[] args) {
        SellTicketThread01 sellTicket01 = new SellTicketThread01();
        SellTicketThread01 sellTicket02 = new SellTicketThread01();
        SellTicketThread01 sellTicket03 = new SellTicketThread01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();

//        SellTicketThread02 sellTicket = new SellTicketThread02();
//        new Thread(sellTicket).start();
//        new Thread(sellTicket).start();
//        new Thread(sellTicket).start();

//        SellTicketThread03 t1 = new SellTicketThread03();
//        SellTicketThread03 t2 = new SellTicketThread03();
//        new Thread(t1).start();
//        new Thread(t1).start();
//        new Thread(t1).start();
//        new Thread(t2).start();
    }
}

//出现超卖现象
//02将使用进程同步来解决问题

//!!!!多个线程的的操作对象在执行同步代码块时争夺的锁对象必须是他们的共有资源才能锁住。
//比如对于 t1对象开了三个线程，那么锁对象可以是this也可以是t1对应类中的成员object。因为同一个对象t1在多个线程操作时用的都是同一把对象锁
//如果三个对象t1,t2,t3 分别开三个线程进行操作，那么需要一个共有资源，此时使用this不可以，因为操作对象不同，三把锁不同。需要使用
//static object或者类锁.class来操作，因为三个对象的属性object是静态的属于类共有，三个对象中只有一个可以得到该锁（同一把锁）

class SellTicketThread01 extends Thread {
    private static int tickets = 100;
    final static Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (/*object*/SellTicketThread01.class) {
                if (tickets <= 0) {
                    System.out.println(Thread.currentThread().getName() + "票售完");
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + " 剩余" + --tickets);
            }
        }
    }
}

class SellTicketThread02 implements Runnable {
    private static int tickets = 100;
    private static boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    private synchronized void sell() {
        if (tickets <= 0) {
            System.out.println(Thread.currentThread().getName() + "票售完");
            loop = false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + " 剩余" + --tickets);
    }
}
//同步代码块
class SellTicketThread03 implements Runnable {
    private static int tickets = 100;
    final static Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (tickets <= 0) {
                    System.out.println(Thread.currentThread().getName() + "票售完");
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + " 剩余" + --tickets);
            }
        }
    }
}