package basic.loop;

public class LoopEx5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
