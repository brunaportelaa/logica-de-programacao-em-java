package br.com.administracao_publica.view;

import br.com.administracao_publica.*;

import java.util.ArrayList;

public class View {

    public static Leitor selecionarLeitor() {
        Leitor leitor = new LeitorScanner();
        int opcao = leitor.lerInt("Selecione 1 para utilizar console ou 2 para utilizar caixa de diálogo na sua interação com o programa", 1,2);
        if (opcao == 1) {
            return new LeitorScanner();
        } else {
            return new LeitorJOptionPane();
        }
    }

    public static AtoAdministrativo cadastrarAtoAdministrativo(AgentePublico agentePublico, Leitor leitor) {
            String assunto = leitor.lerString("Assunto:");
            int qtdMotivos = leitor.lerInt("Quantidade de motivos (min.: 3)", 3);
            ArrayList<String> motivos = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                motivos.add(leitor.lerString("Motivo " + (i + 1) + ": "));
            }
            AtoAdministrativo atoAdministrativo = new AtoAdministrativo(agentePublico, assunto, motivos);
            return atoAdministrativo;
    }

    public static Facultativo cadastrarFacultativo(AgentePublico agentePublico, Leitor leitor) {
        AtoAdministrativo atoAdministrativo = cadastrarAtoAdministrativo(agentePublico, leitor);
        String conclusao = leitor.lerString("Conclusão: ");
        Facultativo facultativo = new Facultativo(atoAdministrativo, conclusao);
        return facultativo;
    }

    public static Tecnico cadastrarTecnico(AgentePublico agentePublico, Leitor leitor) {
        AtoAdministrativo atoAdministrativo = cadastrarAtoAdministrativo(agentePublico, leitor);
        String notaTecnica = leitor.lerString("Nota técnica: ");
        Tecnico tecnico = new Tecnico(atoAdministrativo, notaTecnica);
        return tecnico;
    }

    public static AdministracaoPublica cadastrarAdmPublica() {
        Leitor leitor = selecionarLeitor();
        int qtdAtosAdministrativos = leitor.lerInt("Quantos atos administrativos deseja cadastrar?");
        AdministracaoPublica administracaoPublica = new AdministracaoPublica();
        for (int i = 0; i < qtdAtosAdministrativos; i++) {
            int tipoAtoAdministrativo = leitor.lerInt("Este ato administrativo é FACULTATIVO ou TÉCNICO?\n[1] - FACULTATIVO\n[2] - TÉCNICO", 1, 2);
            AgentePublico agentePublico = cadastrarAgentePublico(administracaoPublica, leitor);
            if (tipoAtoAdministrativo == 1) {
                Facultativo facultativo = cadastrarFacultativo(agentePublico, leitor);
                while (!administracaoPublica.adicionar(facultativo)) {
                    System.out.println("Ato administrativo facultativo inválido. Cadastre-o novamente.");
                    facultativo = cadastrarFacultativo(agentePublico, leitor);
                }
            } else {
                Tecnico tecnico = cadastrarTecnico(agentePublico, leitor);
                while (!administracaoPublica.adicionar(tecnico)) {
                    System.out.println("Ato administrativo técnico inválido. Cadastre-o novamente.");
                    tecnico = cadastrarTecnico(agentePublico, leitor);
                }
            }
            System.out.println("Lista atualizada de atos administrativos: ");
            Printer.print(administracaoPublica.getAtosAdministrativos());
        }
        return administracaoPublica;
    }

    public static AgentePublico cadastrarAgentePublico(AdministracaoPublica administracaoPublica, Leitor leitor) {
        AgentePublico agentePublico;
        if (administracaoPublica.getAgentesPublicos().isEmpty()){
            agentePublico = cadastrarAgentePublico(leitor);
            administracaoPublica.adicionar(agentePublico);
        } else {
            int opcao = leitor.lerInt("Deseja cadastrar um novo gente público ou vincular um existente?\n[1] - Cadastrar novo\n[2] - Vincular existente",1,2);
            if (opcao == 1) {
                agentePublico = cadastrarAgentePublico(leitor);
                while (!administracaoPublica.adicionar(agentePublico)){
                    System.out.println("Matrícula já cadastrada no registro de agentes públicos");
                    agentePublico = cadastrarAgentePublico(leitor);
                }
            } else {
                Printer.printAgentesPublicos(administracaoPublica.getAgentesPublicos());
                String matriculaAgentePublicoSelecionado = leitor.lerString("Informe a matrícula do agente público:");
                while (administracaoPublica.getAgentePublicoByMatricula(matriculaAgentePublicoSelecionado) == null) {
                    System.out.println("Não foi possível localizar a matrícula, por favor informe uma matrícula válida.");
                    matriculaAgentePublicoSelecionado = leitor.lerString("Informe a matrícula do agente público:");
                }
                agentePublico = administracaoPublica.getAgentePublicoByMatricula(matriculaAgentePublicoSelecionado);
                return agentePublico;
            }
        }
        return agentePublico;
    }

    public static AgentePublico cadastrarAgentePublico(Leitor leitor) {
        String nome = leitor.lerString("Nome do agente público: ");
        String matricula = leitor.lerString("Matrícula do agente público: ");
        AgentePublico agentePublico = new AgentePublico(nome, matricula);
        return agentePublico;
    }
}
