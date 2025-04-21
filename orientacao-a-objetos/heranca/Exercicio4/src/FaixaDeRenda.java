public enum FaixaDeRenda {
    F(0),
    E(400),
    D(950),
    C(1400),
    B(2300),
    A2(4600),
    A1(8100),
    A(14400);

    double renda;

    FaixaDeRenda (double renda) {
        this.renda = renda;
    }

    public static FaixaDeRenda getFaixa(double salario) {
        FaixaDeRenda faixaSelecionada = null;
        for (FaixaDeRenda faixa : FaixaDeRenda.values()) {
            if (salario >= faixa.renda) {
                faixaSelecionada = faixa;
            } else {
                break;
            }
        }
        return faixaSelecionada;
    }

    public static String getFaixaName(FaixaDeRenda faixa) {
        return faixa.name();
    }
}
