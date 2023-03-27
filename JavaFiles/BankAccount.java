package JavaFiles;
import java.util.UUID;

public class BankAccount {
    private String accountId;
    private String accountName;
    private int balance;

    public BankAccount(String accountName) {
        this.accountId = UUID.randomUUID().toString(); // 계좌번호를 랜덤하게 생성
        this.accountName = accountName;
        this.balance = 0; // 초기 잔액은 0원
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
