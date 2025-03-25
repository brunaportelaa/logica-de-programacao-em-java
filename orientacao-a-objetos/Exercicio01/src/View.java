public class View {
    public static SistemaControleFranquias gerarSistema(){
        SistemaControleFranquias sistema = new SistemaControleFranquias();
        sistema.id = sistema.gerarId();
        lerSistema(sistema);
        return sistema;
    }

    public static SistemaControleFranquias lerSistema(SistemaControleFranquias sistema){
       int totalFranquias = Leitor.lerInt("Quantas franquias deseja informar?");
       sistema.franquias = lerFranquias(totalFranquias);
       return sistema;
    }

    public static Franquia[] lerFranquias(int totalFranquias){
        Franquia[] franquias = new Franquia[totalFranquias];
        for (int i = 0; i < totalFranquias; i++) {
            Franquia franquia = lerFranquia();
            franquias[i] = franquia;
        }
        return franquias;
    }

    public static Franquia lerFranquia() {
        Franquia franquia = new Franquia();
        System.out.println("Preencha os dados da franquia: ");
        franquia.qtdGB= Leitor.lerInt("Quantidade de GB:", 1);
        franquia.diaExpiracao = Leitor.lerInt("Data mensal de expiração: ", 1, 30);
        franquia.empresa = Leitor.lerInt("Qual é a empresa da franquia?\n[1] - VIVO\n[2] - TIM\n[3] - CLARO\n[4] - OI", 1, 4);
        franquia.preco = Leitor.lerDouble("Preço da franquia: ", 0.0);
        return franquia;
    }
}
