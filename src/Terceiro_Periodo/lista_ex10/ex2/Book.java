package Terceiro_Periodo.lista_ex10.ex2;/*
Crie uma classe Livro com atributos privados: título, autor, ano e número de páginas.
Adicione métodos para realizar a manipulação desses atributos (get e set) e também crie um método
para exibir informações sobre o livro chamado exibirDadosLivro(). Crie uma classe chamada PrincipalLivro e
instancie pelo menos dois objetos do tipo Livro e defina valores para esses objetos. Mostre na tela os valores desses
objetos utilizando o método exibirDadosPessoa().
 */

public class Book {
    private String title;
    private String author;
    private int pagNumbers;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPagNumbers() {
        return this.pagNumbers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagNumbers(int pagNumbers) {
        this.pagNumbers = pagNumbers;
    }

    public void showBookData() {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.pagNumbers);
    }

}
