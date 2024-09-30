package basic.study17.ex3;

public class DefaultPay implements Pay {

  @Override
  public boolean pay(int amount) {
    System.out.println("결재 수단이 없습니다.");
    return false;
  }
}
