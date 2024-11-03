package hanghae99.week5.state.join;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try{
                Thread.sleep(1000);

                System.out.println(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "Thread");
        thread.start(); // Runnable 상태로 전환

        long start = System.currentTimeMillis();

        try {
            thread.join(); // thread가 종료될 때까지 기다림
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}
