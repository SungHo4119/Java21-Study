package hanghae99.week1;

import java.util.Scanner;

public class AsciiCodePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요.");
        int ascii = sc.next().charAt(0);
        char ch = (char) ascii;

        System.out.println("ch = " + ch);
        System.out.println("ascii = " + ascii);
    }
}
