package hanghae99.week3.test;

public class Calulator {

    private AbstractOperation abstractOperation;

    public double calculate(int firstNumber, int secondNumber){
        return abstractOperation.operate(firstNumber, secondNumber);
    }


    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }
}
