import java.util.Scanner;

public class Leitor {
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static Turma lerTurma(String msg){
        int qtdAlunos = lerInt(msg);
        return lerTurma(qtdAlunos);
    }

    public static Turma lerTurma(int totalAlunos){
        Turma turma = new Turma();
        turma.totalAlunos = totalAlunos;
        turma.alunos = new Aluno[totalAlunos];
        for ( int i = 0; i < totalAlunos; i++){
            turma.alunos[i] = lerAluno();
            if (turma.alunos[i].bolsista) {
                turma.totalBolsistas++;
            } else {
                turma.totalRegulares++;
            }
        }
        return turma;
    }

    public static Aluno lerAluno(){
        Aluno aluno = new Aluno();
        aluno.nome = lerString("Informe o nome do aluno");
        aluno.matricula = lerInt("Informe o número de matrícula do aluno");
        aluno.bolsista = (lerInt("Informe 1 para aluno bolsista e 2 para aluno regular") == 1);
        return aluno;
    }
}
