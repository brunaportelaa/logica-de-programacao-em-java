public class Servico {

    final int CODIGO_FILMAGEM = 2;
    final int CODIGO_FOTOGRAFIA = 1;

    private String descricao;
    private String data;
    private double preco;
    private int tamanhoEquipe;
    private int tipo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(int dia, int mes, int ano) {
        String data = dia + "-" + mes + "-" + ano;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public void setTamanhoEquipe(int tamanhoEquipe) {
        this.tamanhoEquipe = tamanhoEquipe;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipoDescricao(int tipo) {
        if (tipo == CODIGO_FILMAGEM) {
            return "Filmagem";
        } else {
            if (tipo == CODIGO_FOTOGRAFIA) {
                return "Fotografia";
            }
            else {
                return "Tipo inválido";
            }
        }
    }

    public Servico(String descricao, double preco) {
        setDescricao(descricao);
        setPreco(preco);
    }

    public String toString() {
        String string = "Descrição: " + this.getDescricao()
                + "\nTipo de serviço: " + this.getTipoDescricao(this.getTipo())
                + "\nData: " + this.getData()
                + "\nPreço: R$" + this.getPreco()
                + "\nTamanho da equipe: " + this.getTamanhoEquipe() + "\n";
        return string;
    }

}
