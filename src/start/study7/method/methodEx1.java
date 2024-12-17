package start.study7.method;

public class methodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = sum(a,b,c);
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
        int x = 15;
        int y = 25;
        int z = 35;
        sum = sum(x,y,z);
        average = sum / 3.0;
        System.out.println("평균값: " + average);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}