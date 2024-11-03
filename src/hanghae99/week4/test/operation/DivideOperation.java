package hanghae99.week4.test.operation;


public class DivideOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber){
        return (double) firstNumber / secondNumber;
    }
}
