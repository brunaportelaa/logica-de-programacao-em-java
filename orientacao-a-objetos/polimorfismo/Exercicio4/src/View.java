public class View {
    public static SistemaCompeticao cadastrarSistemaCompeticao() {
        SistemaCompeticao sistemaCompeticao = new SistemaCompeticao();
        boolean continuar = true;
        while (continuar) {
            Competidor competidor;
            int tipoSistema = Leitor.lerInt("Qual tipo de competidor deseja cadastrar?\n[1] - PARALÍMPICO\n[2] - OLÍMPICO", 1 , 2);
            if (tipoSistema == 1) {
                competidor = cadastrarCompetidorParalimpico();
            } else {
                competidor = cadastrarCompetidorOlimpico();
            }
            if (!sistemaCompeticao.adicionar(competidor)){
                System.out.println("Já existe um competidor com esse número de inscrição");
            } else {
                sistemaCompeticao.adicionar(competidor);
            }
            int opcao = Leitor.lerInt("Deseja continuar adicionando competidores?\n[1] - SIM\n[2] - NÃ0", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        }
        return sistemaCompeticao;
    }

    public static Competidor cadastrarCompetidor() {
        Competidor competidor = new Competidor();
        System.out.println("----CADASTRO DE COMPETIDOR----");
        competidor.setNome(Leitor.lerString("Nome: "));
        competidor.setNumero(Leitor.lerInt("Número"));
        competidor.setSexo(Leitor.lerInt("Sexo: \n[1] - Feminino\n[2] - Masculino", 1, 2));
        competidor.setIdade(Leitor.lerInt("Idade: "));
        return competidor;
    }

    public static CompetidorOlimpico cadastrarCompetidorOlimpico(){
        Competidor competidor = cadastrarCompetidor();
        int qtdTitulosMundiais = Leitor.lerInt("Número de títulos");
        CompetidorOlimpico competidorOlimpico = (CompetidorOlimpico) competidor;
        competidorOlimpico.setQtdTitulosMundiais(qtdTitulosMundiais);
        return competidorOlimpico;
    }

    public static CompetidorParalimpico cadastrarCompetidorParalimpico(){
        Competidor competidor = cadastrarCompetidor();
        String nomeResponsavel = Leitor.lerString("Nome do responsável: ");
        CompetidorParalimpico competidorParalimpico = (CompetidorParalimpico) competidor;
        competidorParalimpico.setNomeResponsavel(nomeResponsavel);
        return competidorParalimpico;
    }


}
