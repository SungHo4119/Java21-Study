package hanghae99.week4.exceptionSample;

public class Main {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        try {
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() );
        } finally {
            System.out.println("무조건 실행");
        }
    }
}
