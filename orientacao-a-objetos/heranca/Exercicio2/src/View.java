public class View {
    public static Professor cadastrarProfessor() {
        System.out.println("Cadastre um professor: ");
        String nome = Leitor.lerString("Nome: ");
        String cpf = Leitor.lerString("CPF:");
        double salario = Leitor.lerDouble("Salário: ", 0);
        String titulacao = Leitor.lerString("Titulação:");
        Professor professor = new Professor(nome, cpf, salario, titulacao);
        return professor;
    }

    public static Administrativo cadastrarAdministrativo() {
        System.out.println("Cadastre um funcionário administrativo ");
        String nome = Leitor.lerString("Nome: ");
        String cpf = Leitor.lerString("CPF:");
        double salario = Leitor.lerDouble("Salário: ", 0);
        int dependentes = Leitor.lerInt("Quantidade de dependentes: ", 0);
        Administrativo administrativo = new Administrativo(nome, cpf, salario, dependentes);
        return administrativo;
    }
}
