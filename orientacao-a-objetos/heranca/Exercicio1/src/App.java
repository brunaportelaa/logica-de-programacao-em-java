public class App {
    public static void main(String[] args) {
        String frase = Leitor.lerString("Insira uma frase");
        ManipulaString manipulaString = new ManipulaString(frase);

        System.out.println("Quantidade de letras A: " + manipulaString.contarLetra('a'));
        System.out.println("O tamanho da frase é: " + manipulaString.getLength());
        System.out.println("A qualificação da frase é: " + manipulaString.getQualificacao());
        System.out.println("Frase em caixa alta: " + manipulaString.toUpperCase());
        System.out.println("A quantidade de palavras na frase é: " + manipulaString.countPalavras());

    }



}
