package basic.study15.polymorphism.ex1;

public class Child extends  Parent{
    public String value = "Child Value";

    @Override
    public void print() {
        System.out.println("Child Method - Value : " + this.value);
    }
}
