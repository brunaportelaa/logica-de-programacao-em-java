public class App {
    public static void main(String[] args) {

        Administrativo administrativo = View.cadastrarAdministrativo();
        Professor professor = View.cadastrarProfessor();

        System.out.println("O imposto de renda do professor é: " + professor.getImpostoRenda());
        System.out.println("A contribuição sindical do administrativo é: " + administrativo.getContribuicaoSindical());

    }
}
