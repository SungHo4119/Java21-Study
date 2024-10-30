package hanghae99.week2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * List - 순서가 있는 데이터의 집합 => Array (최초길이를 알아야함)
 * 1) Array -> 정적 배열
 * 2) List(ArrayList -> 동적 배열 (크기가 가변적으로 늘어난다)
 *
 * linked list -> 노드로 연결된 리스트 ( 메모리에 남는 공간을 요청해서 여기저기 나눠서 값을 저장하는 방식)
 * => 실제 값이 있는 주소 값으로 목록을 구성하고 저장하는 자료구조
 * 기본적인 가능은 Arraylist와 같지만, 추가, 삭제시에 빠르고 조회하는 속도는 느리다 ( 이곳저곳에 담겨져있어서 느림 )
 */
public class CollectionPractice {
    public static void main(String[] args) {
        arrayList();
        linkedList();
    }

    static void arrayList(){
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(1); // 0번째 인덱스에 1을 추가
        intList.add(2); // 1번째 인덱스에 2를 추가
        intList.add(3); // 2번째 인덱스에 3을 추가

        System.out.println(intList.get(0)); // 0번째 인덱스 값 가져오기

        intList.set(0, 10); // 0번째 인덱스 값 변경
        System.out.println(intList.get(0)); // 0번째 인덱스 값 가져오기

        // 반복문으로 출력 가능
        for (Integer i : intList) {
            System.out.println(i);
        }
        // 삭제되면 앞으로 밀림
        intList.remove(0);
        System.out.println(intList.get(0));
        // 클리어
        intList.clear();
        for (Integer i : intList) {
            System.out.println(i);
        }

    }
    static void linkedList(){
        LinkedList<Integer> intList = new LinkedList<Integer>(); // 선언 + 생성
        intList.add(1); // 0번째 인덱스에 1을 추가
        intList.add(2); // 1번째 인덱스에 2를 추가
        intList.add(3); // 2번째 인덱스에 3을 추가

        System.out.println(intList.toString());
    }
}
