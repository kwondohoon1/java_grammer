package BankService;

public class BankCardService implements BankService{

    @Override
    public void deposit(BankAccount bankAccount, int money) {
        bankAccount.setBalance(bankAccount.getBalance() + money);
        System.out.println("계좌의 잔액은" + bankAccount);
    }

    @Override
    public void withdraw(BankAccount bankAccount, int money) {

    }
}
