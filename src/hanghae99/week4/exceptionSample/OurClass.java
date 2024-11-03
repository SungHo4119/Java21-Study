package hanghae99.week4.exceptionSample;

public class OurClass {
    private final boolean just = true;

    //throws: 던지다 ( 예외를 발생시키다.)
    public void thisMethodIsDangerous() throws OurBadException {
        if(just){
            throw new OurBadException();
        }
    }
}
