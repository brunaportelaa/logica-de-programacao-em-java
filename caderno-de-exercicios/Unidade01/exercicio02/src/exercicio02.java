import java.util.Scanner;

/**
 * Recebe o nome de um aluno, duas notas, calcula a média e informa se ele está aprovado ou reprovado.
 */
public class exercicio02 {

    final static int NOTA_DE_CORTE = 7;


    public static void main(String[] args) {

        String continuar = "S";
        Aluno aluno = new Aluno();

        while (continuar.equals("S")) {
            aluno.nome = Leitor.lerString("Informe o nome do aluno: ");

            aluno.notaMatematica = Leitor.lerDouble("Infome a nota de Matemática do aluno:");

            if (!validarNota(aluno.notaMatematica)) {
                System.out.println("Nota inválida.");
                break;
            }

            aluno.notaPortugues = Leitor.lerDouble("Informe a nota de Português do aluno:");

            if (!validarNota(aluno.notaPortugues)) {
                System.out.println("Nota inválida.");
                break;
            }

            exibirDados(aluno);

            aluno.media = calcularMedia(aluno.notaPortugues, aluno.notaMatematica);

            aluno.isAprovado = isAprovado(aluno.media);

            System.out.println("Deseja verificar a situação de outro aluno?");

            continuar = Leitor.lerString("Digite S para Sim e N para Não.").toUpperCase();

            if (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.println("Valor inválido, o programa será encerrado.");
            }

        }

    }

    public static boolean validarNota(double nota) {
        if (nota > 0 && nota <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void exibirDados(Aluno aluno){
        System.out.println("O nome do aluno é: " + aluno.nome);
        System.out.println("A nota de Português foi: " + aluno.notaPortugues);
        System.out.println("A nota de Matemática foi: " + aluno.notaMatematica);
        System.out.println("A média do aluno foi de: " + aluno.media);
        System.out.println("A situação do aluno é: " + (aluno.isAprovado ? "APROVADO" : "REPROVADO"));
    }

    public static boolean isAprovado(double media){
        return media >= NOTA_DE_CORTE ? true : false;
    }

    public static double calcularMedia(double notaPortugues, double notaMatematica){
        return (notaMatematica + notaPortugues) / 2;
    }
}


