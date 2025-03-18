public class Printer {
    public static void print(Turma turma) {
        System.out.println("A turma possui " + turma.totalAlunos + " alunos");
        print(turma.alunos);
        System.out.println("Alunos bolsistas: " + turma.totalBolsistas);
        System.out.println("Alunos regulares: " + turma.totalRegulares);

    }

    public static void print(Aluno[] alunos){
        for (Aluno aluno : alunos) {
            print(aluno);
        }
    }

    public static void relatorioBolsista(Turma turma){
        for (Aluno aluno : turma.alunos) {
            if(aluno.bolsista){
                print(aluno);
            }
        }
    }

    public static void print(Aluno aluno){
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        if (aluno.bolsista) {
            System.out.println("ALUNO BOLSISTA\n");
        } else {
            System.out.println("ALUNO REGULAR\n");
        }
    }
}
