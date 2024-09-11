package basic.loop;

public class loopEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 10;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        int l = 1;
        while (l <= max) {
            sum += l;
            l++;
        }

        System.out.println(sum);
    }
}
