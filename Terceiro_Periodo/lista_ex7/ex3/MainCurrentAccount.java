package lista_ex7.ex3;

public class MainCurrentAccount {
    public static void main(String[] args) {
        CurrentAccount account1 = new CurrentAccount("Igor", 1000, 32);

        account1.deposit(100);
        account1.showBalance();

        account1.withdraw(20000);
        account1.showBalance();

    }
}
