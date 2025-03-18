public class View {
    public static int[] lerVetor(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int inputInteiro = Leitor.lerInt("Por favor, insira um número inteiro para compor o array:");
            if (inputInteiro > 0) {
                array[i] = inputInteiro;
            } else {
                System.out.println("Número inválido.");
                i--;
            }
        }
        return array;
    }
}
