public class View {
    public static Corrida cadastrarCorrida(int totalCorredores) {
        Corrida corrida = new Corrida();
        for (int i = 0; i < totalCorredores; i++) {
            corrida.adicionar(cadastrarAtleta(corrida));
        }
        return corrida;
    }

    public static Atleta cadastrarAtleta(Corrida corrida) {
        String nome = Leitor.lerString("Informe o nome do corredor: ");

        while (!Atleta.validarNome(nome)) {
            System.out.println("Nome inválido. O nome precisa ter entre "+ Atleta.MIN_LENGTH_NOME + " e " + Atleta.MAX_LENGTH_NOME + " caracteres.");
            nome = Leitor.lerString("Informe o nome do corredor: ");
        }

        long numInscricao = Leitor.lerLong("Informe o número da inscrição do corredor: ", 1);

        while (!corrida.validarNumInscricao(numInscricao)) {
            System.out.println("Esse código já foi cadastrado. Por favor, insira um novo");
            numInscricao = Leitor.lerLong("Informe o número da inscrição do corredor: ", 1);
        }



        Atleta atleta = new Atleta(numInscricao, nome);
        atleta.setTempoProva(Leitor.lerDouble("Tempo de prova do atleta: ", 1));
        atleta.setIdade(Leitor.lerInt("Idade do atleta: "));
        return atleta;
    }
}
