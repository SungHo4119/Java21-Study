package hanghae99.week3.constructor;

public class Main {
    public static void main(String[] args) {

        // 생성자 오버로딩을 통해 여러 상황에서 자동차 생산
        // 제네시스 자동차를 생산 : static final String COMPANY = "GENESIS"; 상수 고정
        // 모든 자동차는 생산시 기어의 최초 상태 'P' 로 고정 : char gear = 'P'; 직접 대입하여 초기화

        // 모델을 변경하면서 만들 수 있고 색상 : Blue, 가격 50000000 고정
        Car car2 = new Car("GV60");
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.gear = " + car2.gear + "\n");

        // 모델, 색상을 변경하면서 만들 수 있고 가격 100000000 고정
        Car car3 = new Car("GV70", "Blue");
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.gear = " + car3.gear + "\n");

        // GV80 모델, 색상 Black, 가격 120000000 으로 완전하게 고정된 경우
        Car car4 = new Car("GV80", "Black", 50000000);
        System.out.println("car4.model = " + car4.model);
        System.out.println("car4.color = " + car4.color);
        System.out.println("car4.price = " + car4.price);
        System.out.println("car4.gear = " + car4.gear + "\n");


        ThisCar thisCar = new ThisCar("GV90");
        System.out.println(thisCar.toString());
    }
}
