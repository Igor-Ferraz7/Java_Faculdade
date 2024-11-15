package Quarto_Periodo.lista_exercicio1.ex1;

public class Filme {
    public String titulo;
    public int duracaoEmMinutos;

    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDuracaoEmHoras(){
        int minutos = getDuracaoEmMinutos();
        int horas = (minutos / 60);
        minutos -= horas * 60;

        System.out.printf("O %s possui %d horas e %d minutos de dura��o.\n", getTitulo(), horas, minutos);
    }
}
