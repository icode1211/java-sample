package chapter09.account;

/**
 * 계좌  -> Account
 * 1. 입금(2000) 2. 출금(-3000) -> Bank (메인 메소드)
 * 잔액이 부족할경우 사용자 정의 예외 -> BalanceInsufficientException
 */
public class Account {
    private long balance;   // 잔액

    public Account() {
        balance = 0;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long money) {
        balance += money;
    }

    public void withdraw(long money) throws BalanceInsufficientException {
        if (balance < money) {
            throw new BalanceInsufficientException(
                    "잔액부족! 현재 잔액: " + balance + ", 출금하고자 하는 금액: " + money);
        }
        balance -= money;
    }

}
