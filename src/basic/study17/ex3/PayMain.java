package basic.study17.ex3;

public class PayMain {
    public static void main(String[] args) {
        PayService p = new PayService();

        p.processPay("kakao", 1000);
        p.processPay("naver", 2000);
        p.processPay("default", 3000);
    }
}
