public class Franquia {
    int qtdGB;
    int diaExpiracao;
    double preco;
    String nomeEmpresa;

    public String toString(){
        String franquia =
                "Quantidade de GB: " + this.qtdGB +
                "\nData de expiração: " + this.diaExpiracao +
                "\nPreço: " + this.preco +
                "\nNome da empresa: " + this.nomeEmpresa;
        return franquia;
    }
}
