import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int operacao = Leitor.lerInt("Por favor, escolha uma operação: 1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Fatorial, 6 - Exponenciação");
        switch (operacao) {
            case 1:
                double parcelaUm = Leitor.lerDouble("Informe um valor para a primeira parcela:");
                double parcelaDois  = Leitor.lerDouble("Informe um valor para a segunda parcela:");
                Printer.print(ServiceCalculadora.adicionar(parcelaUm, parcelaDois));
                break;
            case 2:
                double aditivo = Leitor.lerDouble("Informe um valor para o termo aditivo:");
                double subtrativo  = Leitor.lerDouble("Informe um valor para o termo subtrativo:");
                System.out.println("O resultado da operação é: " + ServiceCalculadora.subtrair(aditivo, subtrativo));
                break;
            case 3:
                double fatorUm = Leitor.lerDouble("Informe um valor para o primeiro fator:");
                double fatorDois  = Leitor.lerDouble("Informe um valor para o segundo fator:");
                System.out.println("O resultado da operação é: " + ServiceCalculadora.multiplicar(fatorUm, fatorDois));
                break;
            case 4:
                double dividendo = Leitor.lerDouble("Informe um valor para o dividendo:");
                double divisor  = Leitor.lerDouble("Informe um valor para o divisor:");
                Printer.print(ServiceCalculadora.dividir(dividendo, divisor));
                break;
            case 5:
                int numero = Leitor.lerInt("Informe um valor para o número:");
                Printer.print(ServiceCalculadora.fatorial(numero));
                break;
            case 6:
                int base = Leitor.lerInt("Informe um valor para a base");
                int expoente  = Leitor.lerInt("Informe um valor para o expoente:");
                System.out.println("O resultado da operação é: " + ServiceCalculadora.exponenciacao(base, expoente));
                break;
            default:
                System.out.println("Por favor, informe uma operação válida.");
        }
    }

}
