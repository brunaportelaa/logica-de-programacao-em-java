public class View {

    public static Turma lerTurma(String msg){
        int qtdAlunos = Leitor.lerInt(msg);
        return lerTurma(qtdAlunos);
    }

    public static Turma lerTurma(int totalAlunos){
        Turma turma = new Turma();
        turma.totalAlunos = totalAlunos;
        turma.alunos = new Aluno[totalAlunos];
        for ( int i = 0; i < totalAlunos; i++){
            turma.alunos[i] = lerAluno();
        }
        return turma;
    }

    public static Aluno lerAluno(){
        Aluno aluno = new Aluno();
        aluno.nome = Leitor.lerString("Informe o nome do aluno");
        aluno.matricula = Leitor.lerLong("Informe o número de matrícula do aluno");
        aluno.bolsista = Leitor.lerInt("Informe 1 para aluno bolsista e 2 para aluno regular") == 1;
        return aluno;
    }
}
