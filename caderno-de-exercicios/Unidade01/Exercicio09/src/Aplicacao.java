public class Aplicacao {
    public static void main(String[] args) {
        Turma turma = View.lerTurma("Informe quantos alunos tem a turma: ");
        ServiceTurma.calcularBolsistas(turma);
        Printer.print(turma);
    }
}
