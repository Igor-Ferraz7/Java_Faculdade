package Segundo_Periodo.julio_aulas;

public class busca_linear {
    public static void main(String[] args) {
        int[] vet = new int[]{1, 3, 5, 12, 7};

        find(vet, 1);

    }

    static void find(int[] vetor, int num) {
        boolean is_finded = false;

        for (int i : vetor) {
            if (num == i) {
                is_finded = true;
                break;
            }
        }

        if (is_finded) {
            System.out.println("Foi encontrado");
        } else {
            System.out.println("Não foi encontrado");
        }

    }
}
