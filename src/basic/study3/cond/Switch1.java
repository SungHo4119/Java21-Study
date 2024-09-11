package basic.study3.cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            default ->  500;
        };
        System.out.println(coupon);
    }
}
