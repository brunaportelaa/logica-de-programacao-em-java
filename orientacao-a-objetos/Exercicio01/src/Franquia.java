public class Franquia {
    int qtdGB;
    int diaExpiracao;
    double preco;
    int empresa;

    public String getEmpresaDescricao() {
        switch (this.empresa) {
            case 1:
                return "VIVO";
            case 2:
                return "TIM";
            case 3:
                return "CLARO";
            case 4:
                return "OI";
            default:
                return "EMPRESA NÃO INFORMADA";
        }
    }

    public String toString(){
        String franquia =
                "Quantidade de GB: " + this.qtdGB +
                "\nData de expiração: " + this.diaExpiracao +
                "\nPreço: " + this.preco +
                "\nNome da empresa: " + this.getEmpresaDescricao();
        return franquia;
    }
}
