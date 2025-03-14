public class Printer {
    public static void printTurma(Turma turma) {
        System.out.println("A turma possui " + turma.totalAlunos + " alunos");

        for (Aluno aluno : turma.alunos) {
            printAlunos(aluno);
        }

        System.out.println("Alunos bolsistas: " + turma.totalBolsistas);
        System.out.println("Alunos regulares: " + turma.totalRegulares);

    }

    public static void printAlunos(Aluno aluno){
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        if (aluno.bolsista) {
            System.out.println("ALUNO BOLSISTA\n");
        } else {
            System.out.println("ALUNO REGULAR\n");
        }
    }
}
