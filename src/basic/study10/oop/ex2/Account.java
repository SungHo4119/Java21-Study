package basic.study10.oop.ex2;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (balance  < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }
}
