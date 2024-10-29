package hanghae99.week1;

import java.util.Arrays;

public class VariableWapperPractice {
    public static void main(String[] args) {
        // (1) boolean
        // 상수를 선언해보자 => 타입 이름 = 값 ;
        final boolean flag = true;

        // (2) char
        char char1 = 'a';

        // (3) 숫자 표현
        byte bytenumber = 127; // -128 ~ 127
        short shortnumber = 32767; // -32768 ~ 32767
        int intnumber = 2147483647; // -2147483648 ~ 2147483647
        long longnumber = 9223372036854775807L; // -9223372036854775808 ~ 9223372036854775807
        System.out.println("byte: " + bytenumber + " short: " + shortnumber + " int: " + intnumber + " long: " + longnumber);
        // (4) 실수 표현
        float floatnumber = 3.14f;
        double doublenumber = 3.14;
        System.out.println("float: " + floatnumber + " double: " + doublenumber);

        // 참조형 변수
        String str = "Hello";
        System.out.println(str);

        // 배열
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        // 레퍼클래스 ( Deprecate )
        Integer num = new Integer(10);
        // Auto Boxing
        Integer num2 = 10;

        // Auto Unboxing
        System.out.println(num2.intValue());

    }
}
