package hanghae99.week3.classPractice;

public class Main {
    public static void main(String[] args) {
        // 배열로 객체 생성 가능
        Car[] carArray = new Car[3];

        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        // 초기 기본 값 확인
        Car car = new Car();
        System.out.println("company: " + car.company);
        System.out.println("model: " + car.model);

        car.color = "blue";
        car.speed = 10;
        car.lights = false;
        System.out.println("color: " + car.color + ", speed: " + car.speed + ", lights: " + car.lights);

        System.out.println("패달 밟기 전 gear: " + car.gear);
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed: " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights: " + lights);

        System.out.println("패달 밟은 후 gear: " + car.gear);
        car.carSpeed(110,120,130);
    }
}
