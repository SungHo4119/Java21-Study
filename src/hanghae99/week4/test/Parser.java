package hanghae99.week4.test;
import hanghae99.week4.test.operation.AddOperation;
import hanghae99.week4.test.operation.DivideOperation;
import hanghae99.week4.test.operation.MultiplyOperation;
import hanghae99.week4.test.operation.SubstractOperation;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    // 숫자 정규식과 일치하는지 확인
    private boolean isNumber(String input) {
        return Pattern.matches(NUMBER_REG, input);
    }
    // 연산자 정규식과 일치하는지 확인
    private boolean isOperation(String input) {
        return Pattern.matches(OPERATION_REG, input);
    }

    public Parser parseFirstNum(String firstInput) throws BadInputException{
        // 구현 1.
        if(!isNumber(firstInput)) {
            throw new BadInputException("숫자");
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException{
        // 구현 1.
        if(!isNumber(secondInput)) {
            throw new BadInputException("숫자");
        }
        calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        if(!isOperation(operationInput)) {
            throw new BadInputException("연산자");
        }
        switch (operationInput) {
            case "+":
                calculator.setOperation(new AddOperation());
                break;
            case "-":
                calculator.setOperation(new SubstractOperation());
                break;
            case "*":
                calculator.setOperation(new MultiplyOperation());
                break;
            case "/":
                calculator.setOperation(new DivideOperation());
                break;
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
