import java.util.Scanner;

public class Leitor {

    public static Turma lerTurma(int qtdAlunos) {
        Turma turma = new Turma();
        for (int i = 0; i < qtdAlunos; i++)
            turma.alunos.add(lerAluno());
        return turma;
    }

    public static Aluno lerAluno(){
        Aluno aluno = new Aluno();
        aluno.nome = lerString("Informe o nome do aluno");
        aluno.notaMatematica = lerDouble("Informe a nota de Matemática do Aluno");
        aluno.notaPortugues = lerDouble("Informe a nota de Português do Aluno");
        return aluno;
    }

    public static String lerString() {
        return new Scanner(System.in).next();
    }
    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }
}
