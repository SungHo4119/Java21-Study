package hanghae99.week4.genericSample;
/*
* T 는 변수 타입이라고한다.
* static 메소드에서는 T를 사용할 수 없다.
* Generic<T, U, E> 이런식으로 여러개의 변수 타입을 사용할 수 있다.
* 제너릭 타입은 래퍼클래스를 받는다?
* Generic<Integer, String, Boolean> instance = new Generic();
*
* 와일드 카드를 이용해 제너릭 제한을 구체적으로 정할 수 있다.
* 1. <? extends T> : T와 T의 자손들만 가능
* 2. <? super T> : T와 T의 조상들만 가능
* 3. <?> : 모든 타입 가능
*
* 메서드를 스코프로 제네릭을 별도로 선언할 수있다.
* ex) public static <T extends Comparable<? super T>> void sort(List<T> list) ..
*  - 제네릭 메소드의 제네릭 타입변수는 해당 메소드에만 적용되기 떄문에 사용가능하다.
*
* */
public class Generic<T> {
    private T data;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>("Hello");
        System.out.println(stringGeneric.getData());
        stringGeneric.setData("World");
        System.out.println(stringGeneric.getData());

        Generic<Integer> integerGeneric = new Generic<>(1);
        System.out.println(integerGeneric.getData());
        integerGeneric.setData(2);
        System.out.println(integerGeneric.getData());
    }
}
