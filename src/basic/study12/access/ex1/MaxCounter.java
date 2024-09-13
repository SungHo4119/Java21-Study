package basic.study12.access.ex1;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }
    // 값 증가
    public void increment() {
        // 검증
        if (!maxCheck()) {
            System.out.println("최대값을 초과할 수 없습니다.");
            // 검증 못할 경우 실행부 실행 안함
            return;
        }

        // 실행
        count++;
    }
    // max 값 체크
    private boolean maxCheck() {
        return count + 1 <= max;
    }
}
