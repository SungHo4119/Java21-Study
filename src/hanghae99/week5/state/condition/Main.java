package hanghae99.week5.state.condition;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final int MAX_TASK = 5;

    // lock을 생성한다.
    private ReentrantLock lock = new ReentrantLock();
    // lock에 대한 조건을 생성한다.
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    private ArrayList<String> tasks = new ArrayList<>();

    public void addMethod(String task) {
        // 락 시작
        lock.lock();
        try{
            while(tasks.size() >= MAX_TASK){
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting...");
                try{
                    condition1.await();
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            tasks.add(task);
            condition2.signal();
            System.out.println("Task added: " + tasks.toString());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Runnable task1 = () -> {
            for (int i = 0; i < 10; i++) {
                main.addMethod("Task1 " + i);
            }
        };

        Thread thread1 = new Thread(task1, "Thread1");
        thread1.start();
    }
}
