package hanghae99.week3.test;

public class Main {
    public static void main(String[] args) {

        Calulator calculator = new Calulator();

        // 더하기
        calculator.setAbstractOperation(new AddOperation());
        System.out.println(calculator.calculate(1, 2));

        // 빼기
        calculator.setAbstractOperation(new SubstractOperation());
        System.out.println(calculator.calculate(1, 2));

        // 곱하기
        calculator.setAbstractOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(1, 2));

        // 나누기
        calculator.setAbstractOperation(new DivideOperation());
        System.out.println(calculator.calculate(1, 2));

    }
}
