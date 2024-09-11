package basic.study4.loop;

public class LoopEx2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int l = 1;
        while (l <= 10) {
            if (l % 2 == 0) {
                System.out.println(l);
            }
            l++;
        }
    }
}
