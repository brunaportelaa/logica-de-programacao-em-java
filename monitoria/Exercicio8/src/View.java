public class View {

    Leitor leitor = new Leitor();

    public Servico cadastrarServico() {
        System.out.println("-----CADASTRO DE SERVIÇO-----");
        String descricao = leitor.lerString("Descrição: ");
        double preco = leitor.lerDouble("Preço: ", 0);
        Servico servico = new Servico(descricao, preco);
        servico.setServico(leitor.lerInt("Informe 1 para serviços de FOTOGRAFIA  e 2 para de FILMAGEM"));

        System.out.println("Informe o dia em que o serviço foi prestado:");
        int dia = leitor.lerInt("Dia do mês: ", 1, 31);
        int mes = leitor.lerInt("Mês (número de 1 a 12): ", 1, 12);
        int ano = leitor.lerInt("Ano: ", 2000, 2050);
        int data = (dia * 100000) + (mes * 10000) + ano;
        servico.setData(data);

        servico.setTamanhoEquipe(leitor.lerInt("Qual foi o tamanho da equipe?"));
        return servico;
    }
}
