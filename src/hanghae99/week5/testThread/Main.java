package hanghae99.week5.testThread;

public class Main {
    public static void main(String[] args) {
        // 방법 1 : Thread 상속
        testThread t = new testThread();
        t.start();
        // 방법 2 : Runnable 인터페이스 구현
        testRunable r = new testRunable();
        Thread thread = new Thread(r);
        thread.start();
        // 방법 3 : Runnable 인터페이스 구현 (람다식)
        Runnable r2 = () -> {
            for (int i =0; i< 100; i++){
                System.out.print("#");
            }
        };
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r2);
        thread2.setName("thread2");
        thread3.setName("thread3");

        thread2.start();
        thread3.start();
    }
}
