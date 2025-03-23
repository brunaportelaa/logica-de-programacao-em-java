import java.util.ArrayList;

public class Printer {
    public static void print(UnidadeAdministrativa unidade){
        System.out.println("-------DADOS DA UNIDADE-------");
        System.out.println(unidade.toString());
        System.out.println("Ações: ");
        print(unidade.acoes);
    }

    public static void print(ArrayList<Acao> acoes){
        for (Acao acao : acoes) {
            print(acao);
            System.out.println("______");
        }
    }

    public static void print(Acao acao){
        System.out.println(acao.toString());
    }
}
