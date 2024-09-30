package basic.study17.ex3;

public class PayStore {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (
                option.equals("naver")
        ) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
