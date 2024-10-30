package hanghae99.week2;

import java.util.*;

/**
 * Satck - LIFO (Last In First Out) => 나중에 들어간게 먼저 나온다.
 *  - 수직으로 값을 쌓아놓고 넣었다가 뺀다
 * Queue - FIFO (First In First Out) => 먼저 들어간게 먼저 나온다.
 * Set - 중복을 허용하지 않는 데이터의 집합
 * Map - Key, Value로 이루어진 데이터의 집합
 */
public class Collection2Practice {
    public static void main(String[] args) {
        stackFunction();
        queueFunction();
        setFunction();
        mapFunction();
    }

    static void stackFunction() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // isEmpty() : 스택이 비어있는지 확인
        while(!stack.isEmpty()){
            // pop() : 스택의 맨 위에 있는 값을 빼낸다.
            System.out.println(stack.pop());
        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // peek() : 스택의 맨 위에 있는 값을 확인
        System.out.println(stack.peek());
        // size() : 스택의 크기를 확인
        System.out.println(stack.size());

    }
    static void queueFunction() {
        // add, peek, poll
        // 생성자가 없는 인터페이스
        Queue<Integer> intQueue = new LinkedList<>(); // Queue는 인터페이스이기 때문에 new로 생성할 수 없다.
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);


        // 비어있는지 확인
        while(!intQueue.isEmpty()){
            // poll() : 큐의 맨 앞에 있는 값을 빼낸다.
            System.out.println(intQueue.poll());
        }
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        // peek() : 큐의 맨 앞에 있는 값을 확인
        System.out.println(intQueue.peek());
        // size() : 큐의 크기를 확인
        System.out.println(intQueue.size());
    }
    static void setFunction() {
        // Set은 중복을 허용하지 않는다.
        // HashSet, TreeSet, LinkedHashSet
        // HashSet : 중복을 허용하지 않는다. 순서가 없다.
        // TreeSet : 중복을 허용하지 않는다. 정렬이 된다.
        // LinkedHashSet : 중복을 허용하지 않는다. 입력된 순서대로 출력된다.

        // Set은 인터페이스이기 때문에 new로 생성할 수 없다.
        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(10);
        intSet.add(5);
        intSet.add(1);
        intSet.add(3);

        for (Integer i : intSet) {
            System.out.println(i);
        }
        // contains() : Set에 해당 값이 있는지 확인
        System.out.println(intSet.contains(5));
        System.out.println(intSet.contains(2));
    }
    static void mapFunction(){
        // Map : Key, Value로 이루어진 데이터의 집합
        // HashMap, TreeMap, LinkedHashMap
        // key는 중복을 허용하지 않는다.

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("A", 1);
        intMap.put("B", 2);
        intMap.put("C", 3);
        intMap.put("D", 4);
        // 중복키
        intMap.put("A", 5);

        for (String s : intMap.keySet()) {
            System.out.println(s + " : " + intMap.get(s));
        }
    }
}
