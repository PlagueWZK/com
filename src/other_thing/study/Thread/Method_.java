package Test.Thread;

public class Method_ {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;

        Thread_ thread = new Thread_();
        thread.start();
        for (int i = 0; i < 20; i++) {
            if (i == 5) thread.join();
            System.out.println(Thread.currentThread().getName() + ": " + count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Thread_ extends Thread {
    int count = 0;
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/*
1.yield：线程的礼让。让出cpu，让其他线程执行，但礼让的时间不确定，所以也不一定礼让成功
2.join：线程的插队。插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务
3. thread.setDaemon(true); 设置为守护线程，先设置再start（），当用户线程结束后自动结束该线程
    常见的守护线程：Java垃圾回收机制
 */
