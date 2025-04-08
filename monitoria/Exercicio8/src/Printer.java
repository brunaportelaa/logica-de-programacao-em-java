import java.util.ArrayList;

public class Printer {
    public void print (ArrayList<Servico> servicos) {
        for (Servico servico : servicos) {
            print(servico);
        }
    }

    public void print(Servico servico) {
        System.out.println(servico.toString());
    }
}
