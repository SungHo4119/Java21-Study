package hanghae99.week5.state.sycn;

public class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        // synchronized 블록을 사용하여, 여러 스레드가 동시에 접근하지 못하도록 한다.
        synchronized (this) {
            if (storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple--;
            }
        }
    }
}
