public enum Pais {
    AFRICA_DO_SUL(1, "África do Sul"),
    ALEMANHA(2, "Alemanha"),
    ARABIA_SAUDITA(3, "Arábia Saudita"),
    ARGENTINA(4, "Argentina"),
    AUSTRALIA(5, "Austrália"),
    BANGLADESH(6, "Bangladesh"),
    BRASIL(7, "Brasil"),
    CAMBOJA(8, "Camboja"),
    CANADA(9, "Canadá"),
    CHILE(10, "Chile"),
    CHINA(11, "China"),
    COLOMBIA(12, "Colômbia"),
    COREA_DO_SUL(13, "Coreia do Sul"),
    EGITO(14, "Egito"),
    EMIRADOS_ARABES_UNIDOS(15, "Emirados Árabes Unidos"),
    ESPANHA(16, "Espanha"),
    ESTADOS_UNIDOS(17, "Estados Unidos"),
    ETIOPIA(18, "Etiópia"),
    FILIPINAS(19, "Filipinas"),
    FRANCA(20, "França"),
    GANA(21, "Gana"),
    GRECIA(22, "Grécia"),
    HOLANDA(23, "Holanda"),
    INDIA(24, "Índia"),
    INDONESIA(25, "Indonésia"),
    IRA(26, "Irã"),
    IRAQUE(27, "Iraque"),
    ITALIA(28, "Itália"),
    JAPAO(29, "Japão"),
    MALASIA(30, "Malásia"),
    MARROCOS(31, "Marrocos"),
    MEXICO(32, "México"),
    MIANMAR(33, "Mianmar"),
    NEPAL(34, "Nepal"),
    NIGERIA(35, "Nigéria"),
    PAQUISTAO(36, "Paquistão"),
    PERU(37, "Peru"),
    POLONIA(38, "Polônia"),
    PORTUGAL(39, "Portugal"),
    QUENIA(40, "Quênia"),
    REINO_UNIDO(41, "Reino Unido"),
    REPUBLICA_DEMOCRATICA_DO_CONGO(42, "República Democrática do Congo"),
    ROMENIA(43, "Romênia"),
    RUSSIA(44, "Rússia"),
    SUDAO(45, "Sudão"),
    TAILANDIA(46, "Tailândia"),
    TANZANIA(47, "Tanzânia"),
    TURQUIA(48, "Turquia"),
    UCRANIA(49, "Ucrânia"),
    VIETNA(50, "Vietnã"),
    OUTROS(51, "Outros");

    public int valor;
    public String nomePais;

    private Pais(int valor, String nomePais) {
        this.valor = valor;
        this.nomePais = nomePais;
    }

    public static String getListaPaises() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Pais pais : Pais.values()) {
            stringBuilder.append("\n[" + pais.valor + "]" + " - " + pais.nomePais);
        }
        return stringBuilder.toString();
    }

    public static Pais getPaisByValor(int valor) {
        Pais paisSelecionado = null;
        for (Pais pais : Pais.values()) {
            if (pais.valor == valor) {
                paisSelecionado = pais;
            }
        }
        return paisSelecionado;
    }




}
