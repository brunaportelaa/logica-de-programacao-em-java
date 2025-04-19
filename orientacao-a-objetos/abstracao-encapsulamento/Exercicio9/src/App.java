public class App {
    public static void main(String[] args) {

        DatabaseDeputados DBDeputados = new DatabaseDeputados();
        DatabaseSenadores DBSenadores = new DatabaseSenadores();
        DatabasePartidos DBPartidos = new DatabasePartidos();
        DatabaseEstados DBEstados = new DatabaseEstados();

        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();

        Congresso congresso = new Congresso();

        congresso.getCamaraDeputados().setDeputados(DBDeputados.listAllDeputados());
        congresso.getSenado().setSenadores(DBSenadores.listAllSenadores());

        boolean continuar = true;
        int navegacaoMenu;

        while (continuar) {

            navegacaoMenu = Leitor.lerInt();

            switch (navegacaoMenu) {
                case 1:
                    Menus.filtrarLegisladores(congresso);
                    break;
                case 2:
                    Menus.menuPolitico();
                    break;
                case 3:
                    Menus.menuGeografico();
                    break;
                case 4:
                    Menus.menuFinanceiro();
                    break;
                case 5:
                    Menus.menuPartido();;
                    break;
                default:
                    continuar = false;
            }
        }
    }
}
