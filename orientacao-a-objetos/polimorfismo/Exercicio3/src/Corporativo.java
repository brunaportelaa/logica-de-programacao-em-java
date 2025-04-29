public class Corporativo extends Sistema {
    private int acessosPorMinuto;

    public Corporativo(Sistema sistema) {
        super(sistema.isFullTime(), sistema.getName(), sistema.getFuncionarioResponsavel());
    }

    public int getAcessosPorMinuto() {
        return acessosPorMinuto;
    }

    public void setAcessosPorMinuto(int acessosPorMinuto) {
        this.acessosPorMinuto = acessosPorMinuto;
    }

    @Override
    public int getTotalFuncionarios() {
        int totalFuncionarios = 2;
        if (this.getAcessosPorMinuto() > 5000) {
            totalFuncionarios += 3;
        } else {
            if (this.getAcessosPorMinuto() > 3000 && this.getAcessosPorMinuto() <= 5000) {
                totalFuncionarios += 2;
            }
        }
        return totalFuncionarios;
    }

    @Override
    public String toString(){
        String string = super.toString();
        string += "\nAcessos por minuto: " + this.getAcessosPorMinuto();
        return string;
    }
}
