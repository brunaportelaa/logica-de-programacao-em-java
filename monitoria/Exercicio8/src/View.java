import java.util.ArrayList;

public class View {

    Leitor leitor = new Leitor();

    public GestorServicos cadastrarGestorServicos() {
        GestorServicos gestorServicos = new GestorServicos();
        ArrayList<Servico> servicos = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            servicos.add(cadastrarServico());
            int opcao = leitor.lerInt("Digite 1 se deseja cadastrar mais um serviço e 2 para encerrar o cadastro", 1, 2);
            if (opcao == 2 ) {
                continuar = false;
            }
        }
        gestorServicos.setServicos(servicos);
        return gestorServicos;
    }

    public Servico cadastrarServico() {
        System.out.println("-----CADASTRO DE SERVIÇO-----");
        String descricao = leitor.lerString("Descrição: ");
        double preco = leitor.lerDouble("Preço: ", 0);
        Servico servico = new Servico(descricao, preco);
        servico.setTipo(leitor.lerInt("Informe 1 para serviços de FOTOGRAFIA  e 2 para de FILMAGEM"));

        System.out.println("Informe o dia em que o serviço foi prestado:");
        int dia = leitor.lerInt("Dia do mês: ", 1, 31);
        int mes = leitor.lerInt("Mês (número de 1 a 12): ", 1, 12);
        int ano = leitor.lerInt("Ano: ", 1950, 2050);

        servico.setData(dia, mes, ano);

        servico.setTamanhoEquipe(leitor.lerInt("Qual foi o tamanho da equipe?"));
        return servico;
    }
}
