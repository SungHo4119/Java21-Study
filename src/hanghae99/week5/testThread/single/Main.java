package hanghae99.week5.testThread.single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            for(int i = 0; i < 10; i++) {
                System.out.print("#");
            }
        };
        System.out.println("Main Thread Name: " + Thread.currentThread().getName());
        Thread thread1 = new Thread(task);
        thread1.start();
    }
}
