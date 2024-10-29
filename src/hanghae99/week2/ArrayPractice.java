package hanghae99.week2;

/**
 * 배열
 * 배열은 같은 타입의 데이터를 연속된 공간에 나열시키는 자료구조
 *
 * 사용방법
 * 1. type[] arrayName = new type[size];
 * 2. type arrayName[] = new type[size];
 * 3. type[] arrayName = {value1, value2, value3, ...};
 * 4. type[] arrayName = new type[]{value1, value2, value3, ...};
 *
 * 배열의 길이는 arrayName.length로 구할 수 있다.
 * 배열의 값은 arrayName[index]로 접근할 수 있다.
 *
 * 초기값
 * int[] intArray = new int[5]; // 0, 0, 0, 0, 0
 * char[] charArray = new char[5]; // \u0000, \u0000, \u0000, \u0000, \u0000 (null)
 * String[] stringArray = new String[5]; // null, null, null, null, null
 * boolean[] booleanArray = new Boolean[5]; // false, false, false, false, false
 * Boolean[] booleanArray2 = new Boolean[5]; // null, null, null, null, null
 */
public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        char[] charArray = new char[5];
        String[] stringArray = new String[5];
        boolean[] booleanArray = new boolean[5];
        Boolean[] booleanArray2 = new Boolean[5];

        System.out.println("intArray");
        for (int i : intArray) {
            System.out.println(i);
        }
        System.out.println("charArray");
        for (char c : charArray) {
            System.out.println(c);
        }
        System.out.println("stringArray");
        for (String s : stringArray) {
            System.out.println(s);
        }
        System.out.println("booleanArray");
        for (Boolean b : booleanArray) {
            System.out.println(b);
        }
        System.out.println("BooleanArray");
        for (Boolean b : booleanArray2) {
            System.out.println(b);
        }


        // 다차원 배열
        System.out.println("다차원 배열");
        int[][] intArray2 = new int[2][3];
        for (int[] ints : intArray2) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        int[][] intArray3 = new int[3][3];
        intArray3[0] = new int[]{1};//new int[1];
        intArray3[1] = new int[]{1,2,3};//new int[4];
        intArray3[2] = new int[]{1, 2, 3, 4, 5};//new int[2];

        for (int[] ints : intArray3) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
