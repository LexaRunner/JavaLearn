package by.bsu.proj.accountlogic;

public interface AccountOperationManager {
    double depositInCash (int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(int accountNumber, double amount);
}
