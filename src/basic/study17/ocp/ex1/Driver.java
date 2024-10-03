package basic.study17.ocp.ex1;

public class Driver {
    Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        if (car != null) {
            car.getCarName();
            car.startEngine();
            car.pressAccelerator();
            car.offEngine();
            car = null;
        } else {
            System.out.println("Car is null");
        }
    }
}
