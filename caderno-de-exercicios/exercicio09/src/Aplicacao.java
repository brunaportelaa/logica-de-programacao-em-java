public class Aplicacao {
    public static void main(String[] args) {
        Turma turma = Leitor.lerTurma("Informe quantos alunos tem a turma: ");
        Printer.printTurma(turma);
    }
}
