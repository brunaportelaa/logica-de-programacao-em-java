
public class Aplicacao {
    public static void main(String[] args) {


        Aluno alunoF6 = new Aluno();
        alunoF6.notaUm = 6;
        alunoF6.notaDois = 8;
        System.out.println(alunoF6.getMedia());
        alunoF6.notaDois = 10;
        System.out.println(alunoF6.getMedia());
        System.out.println(alunoF6.isAprovado());















//
//        Turma turma = View.lerTurma("Informe quantos alunos tem a turma: ");
//        ServiceTurma.calcularBolsistas(turma);
//        Printer.print(turma);
//        Printer.print(ServiceTurma.findBySituacao(turma.alunos,false));
//        System.out.println(ServiceTurma.countBySituacao(turma.alunos, true));
    }
}
