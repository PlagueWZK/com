package Test.Thread;

public class ReleaseLock {
    /*
    下面操作会释放锁1.当前线程的同步方法、同步代码块执行结束案例：上厕所，完事出来
    2.当前线程在同步代码块、同步方法中遇到break、return。案例：没有正常的完事，经理叫他修改bug，不得已出来
    3.当前线程在同步代码块、同步方法中出现了未处理的Error或Exception，导致异常结束案例：没有正常的完事，发现忘带纸，不得已出来
    4.当前线程在同步代码块、同步方法中执行了线程对象的wait()方法，当前线程暂停，并释放锁。案例：没有正常完事，觉得需要酝酿下，所以出来等会再进去
     */

    /*
    下面操作不会释放锁1.线程执行同步代码块或同步方法时，程序调用Thread.sleepO、Thread.yield(!)（方法暂停当前线程的执行，不会释放锁
    案例：上厕所，太困了，在坑位上眯了一会
    2.线程执行同步代码块时，其他线程调用了该线程的suspend(方法将该线程挂起，该线程不会释放锁。提示：应尽量避免使用suspend()和resume()来控制线程，方法不再推荐使用
     */
}
