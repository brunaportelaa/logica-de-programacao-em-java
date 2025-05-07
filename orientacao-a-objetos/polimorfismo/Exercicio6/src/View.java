import java.util.ArrayList;

public class View {

    public static CatalogoPolicialTerrorismo cadastrarCatalogoTerroristas() {
        CatalogoPolicialTerrorismo catalogoPolicialTerrorismo = new CatalogoPolicialTerrorismo();
        ArrayList<Terrorista> terroristas = new ArrayList<>();
        boolean continuar = true;
        while(continuar) {
            terroristas.add(cadastrarTerrorista());
            int opcao = Leitor.lerInt("Deseja continuar cadastrando terroristas?\n[1] - SIM\n[2] - NÃO", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        }
        catalogoPolicialTerrorismo.setListaTerroristas(terroristas);
        return catalogoPolicialTerrorismo;
    }

    public static Terrorista cadastrarTerrorista(){
        Terrorista terrorista;
        System.out.println("-----NOVO CADASTRO NO REGISTRO POLICIAL DE TERRORISTAS:-----");
        String nome = Leitor.lerString("Nome: ");
        int qtdExplosivos = Leitor.lerInt("Quantidade de explosivos: ");
        int isSuicida = Leitor.lerInt("O terrorista cometeu suicídio?\n[1] - SIM\n[2] - NÃO", 1, 2);
        if (isSuicida == 1) {
            terrorista = new TerroristaSuicida(nome, qtdExplosivos);
            cadastrarTerrorista((TerroristaSuicida) terrorista);
        } else {
            terrorista = new TerroristaNaoSuicida(nome, qtdExplosivos);
            cadastrarTerrorista((TerroristaNaoSuicida) terrorista);
        }
        return terrorista;
    }

    public static TerroristaSuicida cadastrarTerrorista(TerroristaSuicida terrorista) {
        int religiao = Leitor.lerInt("Qual a religião do terrorista?\n" + Religiao.getListaReligioes(),  0, 6);
        terrorista.setReligiao(religiao);
        return terrorista;
    }

    public static TerroristaNaoSuicida cadastrarTerrorista(TerroristaNaoSuicida terrorista) {
        int pais = Leitor.lerInt("Qual é o país do terrorista?\n" + Pais.getListaPaises(), 1, 51 );
        terrorista.setPais(pais);
        return terrorista;
    }
}
