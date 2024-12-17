package middle1.study22.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요 [ GUEST, LOGIN, ADMIN ] : ");

        String input = sc.next();

        AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase());

        System.out.println("당신의 등급은 " + authGrade.name() + " 입니다.");

        authGrade.printMenu();
    }
}
