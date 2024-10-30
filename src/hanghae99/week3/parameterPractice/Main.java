package hanghae99.week3.parameterPractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // 기본형 매개변수
        char type = 'D';
        car.breakPedal(type);
        // 원본 객체는 변하지않는다
        System.out.println("type = " + type);
        System.out.println("car.gear = " + car.gear);

        // 참조형 매개변수
        Tire tire = new Tire();
        tire.company = "금호";

        Tire carInstancTire = car.setTire(tire);
        // 매소드 실행 완료 후 전달한 매개변수로 지정된 참조형 변수 tire의 company 값이 변한다.
        System.out.println("tire.company = " + tire.company);
        System.out.println("carInstancTire.company = " + carInstancTire.company);
    }
}
