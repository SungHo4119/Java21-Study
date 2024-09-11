package basic.study6.array;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        //iter
        for (int student : students) {
            total += student;
        }
        System.out.println("점수 총합 = " + total);
        System.out.println("점수 평균 = " + (total / students.length));
    }
}

