package chapter09.account;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(2000);
        System.out.println("잔액: " + account.getBalance());

        try {
            account.withdraw(2000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
