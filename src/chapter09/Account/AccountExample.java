package chapter09.Account;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(30000);  // 3만원 입금
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(100000);  // 10만원 출금
            System.out.println("출금 후 : " + account.getBalance());

        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("출금업무 종료합니다.");
        }
    }
}
