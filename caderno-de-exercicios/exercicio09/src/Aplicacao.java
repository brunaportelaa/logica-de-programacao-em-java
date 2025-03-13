public class Aplicacao {
    public static void main(String[] args) {
        Turma turma = Leitor.lerTurma("Informe quantos alunos tem a turma: ");
        ServiceTurma.calcularBolsistas(turma);
        Printer.printTurma(turma);
    }
}
