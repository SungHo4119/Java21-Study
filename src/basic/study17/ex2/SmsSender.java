package basic.study17.ex2;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("문자을 발송합니다 : " + message);
    }
}
