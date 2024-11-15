package provaN1;

public class ex2 {
    public static void main(String[] args){
        relative_num(1290);
        relative_num(291);
    }

    static void relative_num(int num) {
        int count = 0;
        int copy_num = num;
        int[] vetor = new int[3];

        for (int i = num/10; num > 0; num/=10) {
            if (count == 2) {
                vetor[2] = copy_num/100;
                break;
            } else {
                vetor[count] = num%10;
            }

            count++;
        }

        System.out.printf("%d Centenas, ", vetor[2]);
        System.out.printf("%d Dezenas, ", vetor[1]);
        System.out.printf("%d Unidades.", vetor[0]);
        System.out.println();
    }

}
