package hanghae99.week2;

import java.util.Arrays;

/**
 * 깊은복사 (deep copy)와 얕은복사 (shallow copy)
 *
 * 깊은 복사란 새로운 객체를 생성하여, 원본 객체의 필드 값들을 복사하는 것을 의미한다. ( 새로운 메모리 공간에 복사 )
 *
 * 얕은 복사란 객체의 참조값만 복사하는 것을 의미한다. ( 같은 메모리 공간을 참조 )
 *
 * 깊은 복사 예시
 * int[] a = {1,2,3}
 * int[] b = a.clone();
 * int[] b = Arrays.copyOf(a, a.length);
 */
public class CopyPractice {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        // 깊은 복사 (deep copy)
        int[] b = Arrays.copyOf(a, a.length);

        a[3] = 5;
        for (int i = 0 ; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            System.out.println("b[" + i + "] = " + b[i]);

        }
        // 얕은 복사 (shallow copy)
        int[] c = a;
        a[3] = 1;
        for (int i = 0 ; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            System.out.println("c[" + i + "] = " + c[i]);

        }


    }
}
