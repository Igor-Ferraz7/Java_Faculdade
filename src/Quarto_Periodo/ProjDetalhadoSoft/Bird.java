package Quarto_Periodo.ProjDetalhadoSoft;

public class Bird {
    public void eat() {
        System.out.println("Eating...");
    }
}

class sparrow extends Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }
}

class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }
}
