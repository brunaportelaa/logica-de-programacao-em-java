public class View {

    public static Turma lerTurma(int qtdAlunos) {
        Turma turma = new Turma();
        for (int i = 0; i < qtdAlunos; i++)
            turma.alunos.add(lerAluno());
        return turma;
    }

    public static Aluno lerAluno(){
        Aluno aluno = new Aluno();
        aluno.nome = Leitor.lerString("Informe o nome do aluno");
        do {
            aluno.notaMatematica = Leitor.lerDouble("Informe a nota de Matemática do Aluno");
            aluno.notaPortugues = Leitor.lerDouble("Informe a nota de Português do Aluno");

            if ((aluno.notaMatematica < 0 && aluno.notaMatematica > 10) || (aluno.notaPortugues < 0 && aluno.notaPortugues > 10)) {
                System.out.println("Nota inválida.");
            }
        } while ((aluno.notaMatematica < 0 && aluno.notaMatematica > 10) || (aluno.notaPortugues < 0 && aluno.notaPortugues > 10) );

        return aluno;
    }

}
