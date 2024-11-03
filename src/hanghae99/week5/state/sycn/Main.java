package hanghae99.week5.state.sycn;

public class Main {
    public static void main(String[] args) {

        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 =" + appleStore.getStoredApple());
                System.out.println(Thread.currentThread().getName() + "이(가) 사과를 먹었습니다.");
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}
