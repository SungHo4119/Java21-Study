package basic.study3.cond;

public class Condop1 {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }

        System.out.println(status);
    }
}
