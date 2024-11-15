package Quarto_Periodo.lista_exercicio1.ex1;

public class TestarFilme {
    public static void main(String[] args) {
        Filme umFilmeQualquer = new Filme("Os Vingadores", 142);
        umFilmeQualquer.exibirDuracaoEmHoras();

        Filme meuFilmeFavorito = new Filme("Clube da Luta", 100);
        meuFilmeFavorito.exibirDuracaoEmHoras();

        meuFilmeFavorito.setDuracaoEmMinutos(139);
        meuFilmeFavorito.exibirDuracaoEmHoras();

        String filmeFav = meuFilmeFavorito.getTitulo();
        String filmeQual = umFilmeQualquer.getTitulo();


        System.out.printf("\nOs filmes no cat�logo s�o %s e %s.", filmeQual, filmeFav);

    }
}
