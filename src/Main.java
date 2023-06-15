import com.alao.Account;

public class Main {
    public static void main(String[] args) {

        Account timAccount = new Account("Tim");
        timAccount.deposit(1000);
        timAccount.withdrawal(500);
        timAccount.deposit(-50);
        timAccount.withdrawal(-20);
        timAccount.calculateBalance();
        timAccount.balance = 5000;

        System.out.println("Balance on account is " + timAccount.getBalance());
        timAccount.transactions.add(4500);
        timAccount.calculateBalance();
    }
}