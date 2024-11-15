package Terceiro_Periodo.lista_ex10.ex3;

public class MainCorrentAccount {
    public static void main(String[] args) {
        CorrentAccount cc = new CorrentAccount();

        cc.setSale(1200.00);
        cc.setAccountNumber(1234);
        cc.setTitularName("Igor");

        cc.showSale();
        cc.withdrawSale(1000.00);
        cc.depositSale(30.00);

    }
}
