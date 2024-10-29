package hanghae99.week2;

public class OperatorPractice {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 1. 산술연산자 : *, /, % > +, -
        // 2. 비교연산자 : >, <, >=, <=, ==, !=
        // 3. 논리연산자 : &&, ||
        // 4. 대입연산자 : =, +=, -=, *=, /=, %=

        // 기타 연산자
        // 1. 형변환 연산자
        int intNumber = 93 + (int) 5.5;
        System.out.println("intNumber = " + intNumber);

        double doubleNumber = (double)93 + 5.5;
        System.out.println("doubleNumber = " + doubleNumber);

        // 2. 삼항연산자
        // (조건식) ? 참일때 값 : 거짓일때 값
        int x = 10;
        int y = 20;
        int result = (x > y) ? x : y;
        System.out.println("result = " + result);

        // 3. instanceof 연산자
        // 객체가 특정 클래스의 인스턴스인지 확인
        String str = "hello";
        boolean result2 = str instanceof String;
        System.out.println("result2 = " + result2);

        // 4. 비트연산자
        // & : 두 비트가 모두 1일때 1, 나머지 0
        // | : 두 비트 중 하나라도 1이면 1, 둘 다 0일때 0
        // ^ : 두 비트가 다르면 1, 같으면 0
        // ~ : 비트를 반전
        // << : 비트를 왼쪽으로 이동
        // >> : 비트를 오른쪽으로 이동
        // >>> : 부호비트를 무시하고 오른쪽으로 이동
        int a = 3; // 0011
        int b = 5; // 0101
        System.out.println("a & b = " + (a & b)); // 0001
        System.out.println("a | b = " + (a | b)); // 0111
        System.out.println("a ^ b = " + (a ^ b)); // 0110
        System.out.println("~a = " + ~a); // 1100
        System.out.println("a << 1 = " + (a << 1)); // 0110
        System.out.println("a >> 1 = " + (a >> 1)); // 0001
        System.out.println("a >>> 1 = " + (a >>> 1)); // 0001

    }
}
