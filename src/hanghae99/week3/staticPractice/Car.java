package hanghae99.week3.staticPractice;

public class Car {
    // 자동차 회사
    static String company = "GENESIS";
    // 자동차 모델
    String model;
    // 자동차 색상
    String color;
    // 자동차가격
    double price;
    // 자동차 속도
    double speed;
    // 기어 P, R, N, D
    char gear = 'P';
    // 자동차 조명상태
    boolean lights;

    // 객체 데이터
    Tire tire = new Tire();
    Handle handle = new Handle();
    Door door = new Door();

    // 생성자 : 처음 객체가 생성될 때 어떤 로직을 수행할지 정의
    public Car(){
        //logic
        // 기본 생성자 생략 가능
    }
    // gasPedal
    double gasPedal(double kmh, char type){
        changeGear(type);
        speed = kmh;
        return speed;
    }

    //breakPedal
    double breakPedal(char type){
        type = 'P';
        changeGear(type);
        speed = 0;
        return speed;
    }

    //changeGear
    char changeGear(char type){
        gear = type;
        return gear;
    }

    // onOffLight
    boolean onOffLight(){
        lights = !lights;
        return lights;
    }

    // horn
    void horm(){
        System.out.println("빵빵");
    }
    // 자동차의 속도 ( 가변 변수 )
    void carSpeed(double ...speeds){
        for (double s : speeds){
            System.out.println("speed: " + s);
        }
    }

    String getCompany(){
        return company;
    }

    static String setCompany(String companyName){
        company = companyName;
        return company;
    }
}

