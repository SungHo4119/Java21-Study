package hanghae99.week4.exceptionSample;

public class OurBadException extends  Exception {
    public OurBadException(){
        super("위험한 행동을 하면 예외 처리");
    }
}