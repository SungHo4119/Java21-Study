package basic.study10.oop1.ex2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.deposit(20000);
        account.withdraw(100000);
        account.withdraw(10000);
        System.out.println("잔고: " + account.balance);
    }
}
