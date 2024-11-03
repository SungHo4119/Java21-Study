package hanghae99.week5.state.yield;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            } catch (InterruptedException e) {
                Thread.yield();
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(task, "Thread1");
        Thread thread2 = new Thread(task, "Thread2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();
    }
}
