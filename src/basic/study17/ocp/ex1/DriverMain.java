package basic.study17.ocp.ex1;

public class DriverMain {
    public static void main(String[] args) {
        Driver d = new Driver();

        d.setCar(new K3Car());

        d.drive();

        d.drive();

        d.setCar(new Model3Car());

        d.drive();

        d.drive();
    }
}
