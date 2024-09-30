package basic.study17.ex1;

public class K3Car implements Car{
    private final static String carName = "K3Car";
    @Override
    public void startEngine() {
        System.out.println(carName + " : 엔진 On");
    }

    @Override
    public void offEngine() {
        System.out.println(carName + " : 엔진 off");
    }

    @Override
    public void pressAccelerator() {
        System.out.println(carName + " : 엑셀");
    }

    @Override
    public void getCarName() {
        System.out.println("car name is : " + carName );
    }
}
