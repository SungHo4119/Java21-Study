package hanghae99.week1;

public class VariableChangePractice {
    public static void main(String[] args) {
        // 명시적 형변환
        // double or float => int
        double doubleNumber = 3.14;
        float floatNumber = 3.14f;

        int intNumber = (int) doubleNumber;
        int intNumber2 = (int) floatNumber;

        System.out.println("double -> int : " + doubleNumber + " -> " + intNumber);
        System.out.println("float -> int : " + floatNumber + "  -> " + intNumber2);
        // int => double or float
        int intNumber3 = 3;
        double doubleNumber2 = (double) intNumber3;
        float floatNumber2 = (float) intNumber3;

        System.out.println("int -> double : " + intNumber3 + " -> " + doubleNumber2);
        System.out.println("int ->  float : " + intNumber3 + " -> " + floatNumber2);

        // 묵시적 형변환 ( 작은 변수에서 큰 변수로 )
        // byte(1) => short(2) => int(4) => long(8) => float(4) => double(8)

        // byte => int
        byte byteNumber = 127;
        int intNumber4 = byteNumber;

        System.out.println("byte -> int : " + byteNumber + " -> " + intNumber4);

        // 할당이 아닌 자동으로 되는 경우
        int intNumber5 = 10;
        double doubleNumber3 = 0.314;

        System.out.println("int + double : " + intNumber5 + doubleNumber3);
        int intNumber6 = 4;
        double doubleNumber4 = 2.5;

        double result = intNumber6 / doubleNumber4;
        System.out.println("int / double : " + result);

    }
}
