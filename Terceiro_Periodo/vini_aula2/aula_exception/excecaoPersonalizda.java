package vini_aula2.aula_exception;

public class excecaoPersonalizda {
    public static void main(String[] args) throws Exception{
        int value;

        try {
            value = -1;
            if (value < 0) {
                throw new ValorNegativoErro("Valor negativo");
            }
        }
        catch (ValorNegativoErro vne) {
            System.out.println("Erro: " + vne.getMessage());
        }
    }
}
