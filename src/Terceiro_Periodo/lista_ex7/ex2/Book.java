package Terceiro_Periodo.lista_ex7.ex2;

/*
Crie uma classe Livro com atributos privados: título, autor, ano e número de páginas.
Adicione métodos para realizar a manipulação desses atributos (get e set) e também crie um
método para exibir informações sobre o livro chamado exibirDadosLivro(). Crie uma classe
chamada PrincipalLivro e instancie pelo menos dois objetos do tipo Livro e defina valores
para esses objetos. Mostre na tela os valores desses objetos utilizando o método
exibirDadosPessoa().
 */
public class Book {
    private String title;
    private String author;
    private int number;
    private int pagNums;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumber() {
        return number;
    }

    public int getPagNums() {
        return pagNums;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
         this.author = author;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPagNums(int pag_nums) {
        this.pagNums = pag_nums;
    }


    public void showDataBook(String title, String author, int number, int pagNums) {
        System.out.println(title);
        System.out.println(author);

        System.out.println(number);
        System.out.println(pagNums);
    }
}
