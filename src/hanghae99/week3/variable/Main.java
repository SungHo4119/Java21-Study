package hanghae99.week3.variable;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    public int getNumber() {
        // 지역 변수
        int number = 1;
        number++;
        return number;
    }
}
