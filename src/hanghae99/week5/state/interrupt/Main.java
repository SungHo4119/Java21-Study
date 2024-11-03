package hanghae99.week5.state.interrupt;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                // sleep 일 때 interrupt() 메소드가 호출되면 InterruptedException 발생
                e.printStackTrace();
            }
            System.out.println("tesk : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start(); // Runnable 상태로 전환
        thread.interrupt();
        System.out.println("thhread.interrupt() 호출 = " + thread.isInterrupted());
    }
}
