package basic.study2.operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);

        String result1 = "문자열" + "입니다.";
        System.out.println(result1);

        String string1 = "string1";
        String string2 = "string2";

        System.out.println(string1 + string2);

        String string3 = "a + b = " + 10;
        System.out.println(string3);

        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;

        System.out.println(sum1);
        System.out.println(sum2);

        /*
        1. **괄호 ()**
        2. **단항 연산자** (예: `++` , `--` , `!` , `~` , `new` , `(type)` )
        3. **산술 연산자** (`*` , `/` , `%` 우선,그다음에 `+` , `-` )
        4. **Shift 연산자** ( `<<` , `>>` , `>>>` )
        5. **비교 연산자** ( `<` , `<=` , `>` , `>=` , `instanceof` )
        6. **등식 연산자** (`==` , `!=` )
        7. **비트 연산자** (`&` ,`^` ,`|` )
        8. **논리 연산자** (`&&` , `||` )
        9. **삼항 연산자** (`?:` )
         **/

        String stringEquals1 = "text";
        String stringEquals2 = "text";

        System.out.println(stringEquals1 == stringEquals2);
        boolean resultEquals = stringEquals1.equals(stringEquals2);

        System.out.println(resultEquals);

        System.out.println(result1);




    }

}
