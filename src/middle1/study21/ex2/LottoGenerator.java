package middle1.study21.ex2;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    // 로또 번호 저장
    private int[] lottoNumber = new int[6];
    // 알맞게 뽑은 횟수
    private int count;

    public LottoGenerator() {
        while (count != 6) {
            int randomNumber = random.nextInt(45) + 1;
            if (isUnique(randomNumber)) {
                lottoNumber[count] = randomNumber;
                count++;
            }
        }
    }

    private boolean isUnique(int number) {
        //for (int i : lottoNumber) {
        for (int i = 0; i < count; i++) {
            if (i == number) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return
            "lottoNumber=" + Arrays.toString(lottoNumber);
    }
}
