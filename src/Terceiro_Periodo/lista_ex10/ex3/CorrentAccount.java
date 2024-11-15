package Terceiro_Periodo.lista_ex10.ex3;/*
Crie uma classe ContaCorrente com atributos privados: saldo, número da conta e nome titular.
Crie um construtor para preencher cada um dos atributos dessa classe e também implemente métodos para
depositar(double valor), sacar(double valor) e verificarSaldo(). Crie uma classe chamada PrincipalContaCorrente e crie
um objeto do tipo ContaCorrente. Simule cada uma das operações (sacar, depositar e verificar saldo).
 */

import java.util.Scanner;

public class CorrentAccount {
    private Double sale;
    private int accountNumber;
    private String titularName;

    public Double getSale() {
        return this.sale;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getTitularName() {
        return this.titularName;
    }


    public void setSale(Double sale) {
        this.sale = sale;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public void depositSale(Double sale) {
        this.sale += sale;
        System.out.printf("Voce depositou R$%.2f.\n", sale);
        showSale();
    }

    public void withdrawSale(Double sale) {
        Scanner input = new Scanner(System.in);
        while (sale > this.sale) {
            System.out.println("Saldo menor do que a quantia que quer sacar.");
            System.out.printf("Digite uma quantia menor que R$%.2f: ", this.sale);
            System.out.println();
            sale = input.nextDouble();
        }
        this.sale -= sale;
        System.out.printf("Voce sacou R$%.2f.\n", sale);
        showSale();
    }

    public void showSale() {
        System.out.printf("Ola %s! Seu saldo e %.2f.\n\n", this.titularName, this.sale);
    }
}
