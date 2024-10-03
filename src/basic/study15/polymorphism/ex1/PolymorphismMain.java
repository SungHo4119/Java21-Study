package basic.study15.polymorphism.ex1;

public class PolymorphismMain {

    public static void main(String[] args) {
        Parent p = new Parent();

        System.out.println(p.value);
        p.print();

        Child c = new Child();
        System.out.println(c.value);
        c.print();

        Grandson g = new Grandson();
        System.out.println(g.value);
        g.print();

        // 다형성 테스트
        Parent p1 = new Child();
        System.out.println(p1.value);
        p1.print();

        Parent p2 = new Grandson();
        System.out.println(p2.value);
        p2.print();

        Child c1 = new Grandson();
        System.out.println(c1.value);
        c1.print();
    }
}
