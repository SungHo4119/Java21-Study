package hanghae99.week5.testThread.multi;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            for(int i = 0; i < 100; i++) {
                System.out.print("#");
            }
        };
        Runnable task2 = () -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            for(int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };
        System.out.println("Main Thread Name: " + Thread.currentThread().getName());
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
