package hanghae99.week5.state.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            // sleep 는  예외처리가 필수다.
            // - interrupt()를 만나면 다시 실행되기 때문에 InterruptedException이 발생 할 수 있다.
            try{
                // satic 메소드이기 때문에 Thread.sleep()으로 호출한다.
                // 특정 객체가 아닌 현재 스레드를 대상으로 sleep을 호출한다.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tesk : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread-Sleep");
        thread.start();

        try{
            // main 스레드가 1초간 sleep
            // 현재 흐름의 스레드가 sleep 상태로 전환된다.
            thread.sleep(1000);
            System.out.println("main : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
