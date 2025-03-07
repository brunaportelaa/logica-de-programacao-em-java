public class exercicio132 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = (calcularTransposta(matriz));

        for (int i = 0; i < matriz2.length; i++) {
            System.out.println( matriz2[i][0] + " " + matriz2[i][1] + " " + matriz2[i][2]);
        }
    }

    public static int[][] calcularTransposta(int[][] matriz) {
        int[][] transposta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }




}
