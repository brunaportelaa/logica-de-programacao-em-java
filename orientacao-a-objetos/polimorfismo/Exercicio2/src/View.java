public class View {

    public static Professor cadastrarProfessor() {
        System.out.println("---CADASTRO NOVO PROFESSOR---");
        int matricula = Leitor.lerInt("Código de matrícula: ");
        Professor professor = new Professor(matricula);
        professor.setNome(Leitor.lerString("Nome: "));
        professor.setTitulacao(Leitor.lerInt("[1] - Doutor\n[2] - Mestre\n[3] - Pós-graduado\n[4] - Licenciado", 1 ,4));
        professor.setSalario(Leitor.lerDouble("Salário: ", 1000));
        return professor;
    }

    public static RegistroProfessores cadastrarProfessores() {
        RegistroProfessores registroProfessores = new RegistroProfessores();
        boolean continuar = true;
        while(continuar) {
            Professor novoProfessor = cadastrarProfessor();
            while (!registroProfessores.adicionar(novoProfessor)) {
                System.out.println("Professor já cadastrado, por favor informe um novo com matrícula única.");
                novoProfessor = cadastrarProfessor();
            }
            int opcao = Leitor.lerInt("Deseja adicionar mais algum professor?\n[1] - SIM\n[2] - NÃO", 1,2);
            if (opcao == 2) {
                continuar = false;
            }
        }
        return registroProfessores;
    }
}
