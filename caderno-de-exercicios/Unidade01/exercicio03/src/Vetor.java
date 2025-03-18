public class Vetor {

    int[] vetor = {};

    public double getMedia() {
        double soma = 0;
        for (int num : this.vetor) {
            soma += num;
        }
        return soma / this.vetor.length;
    }

    public int[] sortByImpar(int[] vetor) {
        int qtdImpares = countByImpar(vetor);
        int[] impares = new int[qtdImpares];
        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                impares[j] = vetor[i];
                j++;
            }
        }
        return impares;
    }

    public int countByImpar(int[] vetor) {
        int qtdImpares = 0;
        for ( int inteiro : vetor) {
            if (inteiro % 2 != 0) {
                qtdImpares++;
            }
        }
        return qtdImpares;
    }

}
