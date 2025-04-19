import java.util.ArrayList;

public class Menus {

    public static void filtrarLegisladores(Congresso congresso) {
        boolean continuar = true;
        while (continuar) {
            int navegacaoMenu = Leitor.lerInt("[1] - Exibir todos os legisladores\n[2] - Exibir legisladores por instituição (Senado ou Câmara)\n[3] - Filtrar por partido\n[4] - Filtrar por estado\n[5] - Filtrar por viés ideológico\n[6] - Filtrar reeleitos ou legisladores em primeira candidatura\n[7] - Relatório geral\nDigite qualquer outro número para encerrar.");
            int opcao;
            String titulo = "";
            switch (navegacaoMenu) {
                case 1:
                    String todosLegisladores = GeradorRelatorio.concatenarConteudoRelatorio(congresso.getAllLegisladores());
                    GeradorRelatorio.salvarRelatorio("Todos os legisladores", todosLegisladores);
                    break;
                case 2:
                    opcao = Leitor.lerInt("[1] - Câmara dos Deputados\n[2] - Senado", 1, 2);
                    if (opcao == 1) {
                        String todosDeputados = GeradorRelatorio.concatenarConteudoRelatorio(congresso.getCamaraDeputados().getDeputados());
                        GeradorRelatorio.salvarRelatorio("Deputados da Câmara dos Deputados", todosDeputados);
                    } else {
                        String todosSenadores = GeradorRelatorio.concatenarConteudoRelatorio(congresso.getSenado().getSenadores());
                        GeradorRelatorio.salvarRelatorio("Senadores do Senado Federal", todosSenadores);
                    }
                    break;
                case 3:
                    // Filtrar por partido
                    opcao = Leitor.lerInt("Deseja pesquisar o partido pela [1] sigla ou pelo seu [2] código numérico?", 1 , 2);
                    String legisladoresByPartido;
                    if (opcao == 1) {
                        String siglaPartido = Leitor.lerString("Informe a sigla do partido: ");
                        String legisladoresByPartidoSigla = GeradorRelatorio.concatenarConteudoRelatorio(congresso.filterLegisladoresByPartidoSigla(siglaPartido));
//                        titulo = "Legisladores do partido " + congresso.getPartidoPorSigla(siglaPartido).getNome() + "-";
                        legisladoresByPartido = legisladoresByPartidoSigla;
                    } else {
                        int codigoPartido = Leitor.lerInt("Informe o código do partido:");
                        String legisladoresByPartidoCodigo = GeradorRelatorio.concatenarConteudoRelatorio(congresso.filterLegisladoresByPartidoCodigo(codigoPartido));
                        legisladoresByPartido = legisladoresByPartidoCodigo;
                    }
                    GeradorRelatorio.salvarRelatorio("Legisladores filtrados por partido", legisladoresByPartido);
                    break;
                case 4:
                    // Filtrar por estado
//                    opcao = Leitor.lerInt("Deseja pesquisar o estado pela [1] sigla ou pelo seu [2] nome?", 1 , 2);
//                    if (opcao == 1) {
//                        String sigla = Leitor.lerString("Informe a sigla do estado: ");
//                        legisladoresFiltrados = congresso.filterLegisladoresByEstadoSigla(sigla);
//                        for (Legislador legislador : legisladoresFiltrados) {
//                            legisladores.append(legislador);
//                        }
//                    } else {
//                        String nome = Leitor.lerString("Informe o nome do estado");
//                        for (Legislador legislador : congresso.getAllLegisladores()) {
//                            if (legislador.getEstado().getNome().equalsIgnoreCase(nome)) {
//                                legisladores.append(legislador.toString());
//                                titulo = "Legisladores do partido " + legislador.getEstado().getNome() + " - " + legislador.getEstado().getSigla();
//                            }
//                        }
//                    }
//                    geradorRelatorio.salvarRelatorio(titulo, legisladores.toString());
//                    legisladores = new StringBuilder();
                    break;
                case 5:
                    // Filtrar por viés ideológico
//                    int ideologia = Leitor.lerInt("[1] - Extrema direita\n[2] - Direita\n[3] - Centro-Direita\n[4] - Centro\n[5] - Centro-Esquerda\n[6] - Esquerda");
//                    for (Legislador legislador : congresso.getAllLegisladores()) {
//                        if (legislador.getPartido().getIdeologia() == ideologia) {
//                            legisladores.append(legislador.toString());
//                        }
//                    }
//                    geradorRelatorio.salvarRelatorio("Legisladores de " + Ideologia.getTitulo(ideologia) , legisladores.toString());
//                    legisladores = new StringBuilder();
                    break;
                case 6:
                    // Filtrar reeleitos / primeira candidatura
//                    int isReeleito = Leitor.lerInt("[1] - Filtrar legisladores reeleitos\n[2] - Filtrar legisladores em primeira candidatura", 1, 2);
//                    for (Legislador legislador : congresso.getAllLegisladores()) {
//                        if (legislador.isReeleito() && isReeleito == 1) {
//                            legisladores.append(legislador.toString());
//                            titulo = "Legisladores reeleitos";
//                        } else {
//                            if (!legislador.isReeleito() && isReeleito == 2) {
//                                legisladores.append(legislador.toString());
//                                titulo = "Legisladores de primeira candidatura";
//                            }
//                        }
//                    }
//                    geradorRelatorio.salvarRelatorio(titulo , legisladores.toString());
//                    legisladores = new StringBuilder();
                    break;
                default:
                    //sair para o menu principal
                    continuar = false;
            }
        }
    }

    public static void menuFinanceiro() {
        int navegacaoMenu = Leitor.lerInt();
        boolean continuar = true;
        while (continuar) {
            switch (navegacaoMenu) {
                case 1:
                    // Custo total
                    break;
                case 2:
                    // Custo por Estado
                    // Custo de um partido dentro do Estado
                    // Custo de congresso/senado dentro de um estado
                    // Custo reeleitos / primeira candidatura dentro de um estado
                    // Custo médio por legislador dentro de um estado
                    // Relatório de custos do Estado
                    break;
                case 3:
                    // Custo por partido
                    // Custo por estado do partido
                    // custo congresso/senado do partido
                    // custo reeleitos/primeira candidatura do partido
                    // custo médio por legislador dentro do partido
                    // Relatório de custos do partido
                    break;
                case 4:
                    // Custo congresso/senado
                    // Custo do congresso/senado de um estado
                    // Custo reeleitos/primeira candidatura do senado/congresso
                    // custo total do senado
                    // custo total do congresso
                    // Relatório de custos do congresso / senado
                    break;
                case 5:
                    // Custo reeleitos/não reeleitos
                    // custo reeleitos/não por estado (dá pra criar uma função? é o mesmo do case 1)
                    // custo reeleitos/nao por partido
                    // custo reeleitos/nao congresso/senado
                    // relatorio geral reeleitos/nao
                    break;
                case 6:
                    // Consulta custo de um legislador
                    break;
                case 7:
                    // Consulta custo de um grupo de legisladores
                    break;
                case 8:
                    // Relatório geral
                    break;
                default:
                    // sair para o menu principal
                    continuar = false;
            }
        }

    }

    public static void menuPolitico() {
        int navegacaoMenu = Leitor.lerInt();
        boolean continuar = true;
        while (continuar) {
            switch (navegacaoMenu) {
                case 1:
                    // Qtd de legisladores de cada ideologia total
                    break;
                case 2:
                    // Qtd de legisladores de cada ideologia
                    break;
                case 3:
                    // Qtd de legisladores de cada partido
                    break;
                case 4:
                    // Qtd de legisladores de cada instituição
                    break;
                case 5:
                    // Qtd de legisladores reeleitos/nao
                    break;
                case 6:
                    // Relatório Geral
                default:
                    // sair para o menu principal
                    continuar = false;
            }
        }
    }

    public static void menuGeografico(){
        //selecione um estado
        // gera o relatorio inteirinho daquele estado
        // mostra todos os legisladores daquele estado (separados por partido, e partidos agrupados em viés ideológico. uma lista para cada instituição)
        // Custo total do estado - discriminado por partido (agrupado por viés ideológico), dentro de cada instituição
    }

    public static void menuPartido() {
        // Selecione um partido
        // Gera o relatório do partido
        // Todos os legisladores do partido (organizados instituicao e dentro, por estado - sinalizar os que foram reeleitos)
        // Relatorio de custos do partido
            // Custo no senado/camara
            // Custo por estado
            // Custo reeleitos/nao
            // Custo medio por legislador
    }


}
