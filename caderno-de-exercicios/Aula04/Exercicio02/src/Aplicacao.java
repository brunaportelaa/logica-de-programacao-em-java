public class Aplicacao {
    public static void main(String[] args) {

        final String COMPARARADOR = "Eu estou estudando Java";

        String string = Leitor.lerString("Escreva uma frase!");

        String caixaAlta = ServiceStrings.transformarCaixaAlta(string);
        String caixaBaixa = ServiceStrings.transformarCaixaBaixa(string);
        int qtdCaracteres = ServiceStrings.contarCaracteres(string);
        boolean resultadoComparacao = ServiceStrings.isEqualTo(COMPARARADOR, string);
        int qtdPalavras = ServiceStrings.contarPalavras(string);

        Printer.printResultado("Sua frase em caixa alta: " + caixaAlta);
        Printer.printResultado("Sua frase em caixa baixa: " + caixaBaixa);
        Printer.printResultado("Sua frase tem " + qtdCaracteres + " caracteres.");
        Printer.printResultado(resultadoComparacao ? "Sua frase é igual a: " + COMPARARADOR : "Sua frase não é igual a: " + COMPARARADOR);
        Printer.printResultado("Sua frase tem " + qtdPalavras + " palavras.");
    }
}
