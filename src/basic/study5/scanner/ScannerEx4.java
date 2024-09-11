package basic.study5.scanner;

import java.util.Scanner;

/*

문제 - 구구단 출력
사용자로부터 하나의 정수 `n` 을 입력받고, 입력받은 정수 `n` 의 구구단을 출력하는 프로그램을 작성하세요.
**실행 결과 예시** ```
구구단의 단 수를 입력해주세요: 8
8단의 구구단:
8x1=8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
```

 */
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");

        int number = scanner.nextInt();
        System.out.println(number + "단의 구구단: ");

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}

