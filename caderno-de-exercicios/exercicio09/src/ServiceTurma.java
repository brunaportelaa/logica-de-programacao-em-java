public class ServiceTurma {

    public static void calcularBolsistas(Turma turma) {
        for ( int i = 0; i < turma.totalAlunos; i++){
            if (turma.alunos[i].bolsista) {
                turma.totalBolsistas++;
            } else {
                turma.totalRegulares++;
            }
        }
    }
}
