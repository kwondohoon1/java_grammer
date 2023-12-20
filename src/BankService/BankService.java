package BankService;

public interface BankService {
    void deposit(BankAccount bankAccount, int money);

    void withdraw(BankAccount bankAccount, int money);

}

