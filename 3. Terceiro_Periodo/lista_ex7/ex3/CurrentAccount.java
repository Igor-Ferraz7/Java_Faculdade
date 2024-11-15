package lista_ex7.ex3;

/*
Crie uma classe ContaCorrente com atributos privados: saldo, número da conta e nome
titular. Crie um construtor para preencher cada um dos atributos dessa classe e também
implemente métodos para depositar(double valor), sacar(double valor) e verificarSaldo().
Crie uma classe chamada PrincipalContaCorrente e crie um objeto do tipo ContaCorrente.
Simule cada uma das operações (sacar, depositar e verificar saldo).
 */

import java.util.Scanner;

public class CurrentAccount {
    private String name;
    private double balance;
    private int numberAccount;

    public CurrentAccount(String name, double balance, int numberAccount) {
        this.name = name;
        this.balance = balance;
        this.numberAccount = numberAccount;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        Scanner input = new Scanner(System.in);

        while (money > balance) {
            System.out.println("Saldo não suficiente. Saque uam quantia menor.");
            //exibirSaldo;
            System.out.print("Digite a quantia a ser sacada: ");
            money = input.nextDouble();
            withdraw(money);
        }

        balance -= money;

    }

    public void showBalance() {
        System.out.printf("Saldo: %.2f\n", balance);
    }
}
