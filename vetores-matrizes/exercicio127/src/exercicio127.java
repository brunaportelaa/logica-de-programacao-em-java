import java.util.Scanner;

public class exercicio127 {
    public static void main(String[] args) {
        int[] vetorUm = new int[5];
        int[] vetorDois = new int[5];
        int[] vetorTres = new int[5];

        formarVetor(vetorUm);
        formarVetor(vetorDois);
        somarVetores(vetorUm, vetorDois, vetorTres);
        imprimirVetor(vetorTres);

    }

    public static int[] somarVetores(int[] vetorUm, int[] vetorDois, int[] vetorTres) {
        for (int i = 0; i < vetorTres.length; i++) {
            vetorTres[i] = vetorUm[i] + vetorDois[i];
        }
        return vetorTres;
    }

    public static int[] formarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerInt(i);
        }
        return vetor;
    }

    public static int lerInt(int i) {
        System.out.println("Insira um número inteiro para a posição " + ( i + 1) + " do vetor:");
        return new Scanner(System.in).nextInt();
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Conteúdo do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }

}
