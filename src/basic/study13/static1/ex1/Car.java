package basic.study13.static1.ex1;

public class Car {
    private String CarName;
    static int TotalCars = 0;

    Car(String CarName) {
        this.CarName = CarName;
        TotalCars++;
        System.out.println("차량 구입, 이름 : " +this.CarName);
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수"+TotalCars);
    }


}
