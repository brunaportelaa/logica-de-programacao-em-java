public class exercicio132 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizTransposta = transformarTransposta(matriz);

        print(matrizTransposta);
    }

    public static void print(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println( matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static int[][] transformarTransposta(int[][] matriz) {
        int[][] transposta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }




}
