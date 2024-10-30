package hanghae99.week3.staticPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println(Car.company);

        Car.company = "KIA";

        System.out.println(Car.company);

        String company = Car.setCompany("Hyundai");
        System.out.println(company);

        Car car = new Car();
        car.company = "BMW";
        System.out.println(car.getCompany());
    }
}
