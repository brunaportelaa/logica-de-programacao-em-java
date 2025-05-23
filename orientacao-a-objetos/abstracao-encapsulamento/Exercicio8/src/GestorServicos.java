import java.util.ArrayList;

public class GestorServicos {

    private ArrayList<Servico> servicos = new ArrayList<>();

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public Servico getMaisCaro() {
        Servico servicoMaisCaro = this.getServicos().getFirst();
        for (Servico servico : this.getServicos()) {
            if (servico.getPreco() > servicoMaisCaro.getPreco()) {
                servicoMaisCaro = servico;
            }
        }
        return servicoMaisCaro;
    }

    public int countServicosByTipo(int tipoServico)  {
        int counter = 0;
        for (Servico servico : this.getServicos()) {
            if (tipoServico == servico.getTipo()) {
                counter++;
            }
        }
        return counter;
    }

    public ArrayList<Servico> filterServicosByTipo(int tipoServico) {
        ArrayList<Servico> servicosSelecionados = new ArrayList<>();
        for (Servico servico : this.getServicos()) {
            if (tipoServico == servico.getTipo()) {
                servicosSelecionados.add(servico);
            }
        }
        return servicosSelecionados;
    }

    public ArrayList<Servico> searchDescricao(String inputBusca) {
        ArrayList<Servico> servicosSelecionados = new ArrayList<>();
        for (Servico servico : this.getServicos()) {
            if (servico.getDescricao().contains(inputBusca)){
                servicosSelecionados.add(servico);
            }
        }
        return servicosSelecionados;
    }
}
