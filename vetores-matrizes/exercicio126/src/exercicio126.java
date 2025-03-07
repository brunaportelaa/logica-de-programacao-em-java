public class exercicio126 {

    public static void main(String[] args) {
        int[] vetor1 = { 1, 2, 3, 4, 5 };
        int[] vetor2 = new int[5];

        copiarVetor(vetor1, vetor2);
        imprimirVetor(vetor2);
    }

    public static void copiarVetor(int[] origem, int[] destino) {
        for (int i = 0; i < origem.length; i++) {
            destino[i] = origem[i];
        }
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Conteúdo do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
}
