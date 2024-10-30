package hanghae99.week3.constructor;

public class ThisCar {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();
    public ThisCar(String modelName) {
        this(modelName, "red", 50000000);
    }
    public ThisCar(String modelName, String colorName) {
        this(modelName, colorName, 50000000);
    }

    public ThisCar(String modelName, String colorName, double priceValue) {
        System.out.println("ThisCar 생성자2 호출");
        model = modelName;
        color = colorName;
        price = priceValue;
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    ThisCar returnInstance() {
        return this;
    }

    @Override
    public String toString() {
        return "ThisCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", gear=" + gear +
                ", lights=" + lights +
                ", tire=" + tire +
                ", door=" + door +
                ", handle=" + handle +
                '}';
    }
}
