package basic.study13.static1.ex2;

public class MathArrayUtils {
    public static int sum (int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        if(values.length == 0 ){
            return 0;
        }
        return  (double)sum(values) / values.length;
    }

    public static int min (int[] values) {
        if(values.length == 0 ){
            return 0;
        }
        int min = values[0];
        for (int value : values) {
            if (min < value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        if(values.length == 0 ){
            return 0;
        }
        int max = values[0];
        for (int value : values) {
            if (max > value) {
                max = value;
            }
        }
        return max;
    }
}
