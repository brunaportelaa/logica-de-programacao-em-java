package br.com.administracao_publica;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdministracaoPublica{

    private ArrayList<AtoAdministrativo> atosAdministrativos;
    private ArrayList<AgentePublico> agentesPublicos;

    public AdministracaoPublica(ArrayList<AtoAdministrativo> listaAtosAdministrativos) {
        setAtosAdministrativos(listaAtosAdministrativos);
    }

    public AdministracaoPublica() {
        setAtosAdministrativos(new ArrayList<AtoAdministrativo>());
        setAgentesPublicos(new ArrayList<AgentePublico>());
    }

    public ArrayList<AtoAdministrativo> getAtosAdministrativos() {
        return atosAdministrativos;
    }

    public void setAtosAdministrativos(ArrayList<AtoAdministrativo> atosAdministrativos) {
        this.atosAdministrativos = atosAdministrativos;
    }

    public ArrayList<AgentePublico> getAgentesPublicos() {
        return agentesPublicos;
    }

    public void setAgentesPublicos(ArrayList<AgentePublico> agentesPublicos) {
        this.agentesPublicos = agentesPublicos;
    }

    public boolean validar(AtoAdministrativo novoAtoAdministrativo) {
        if (novoAtoAdministrativo == null) {
            System.out.println("Novo ato administrativo é nulo");
            return false;
        }

        // Checar qtdMotivos > MIN_MOTIVOS
        if (!novoAtoAdministrativo.checarQtdMotivos()) {
            System.out.println("Quantidade de motivos inferior a 3");
            return false;
        }

        if (!atosAdministrativos.isEmpty()) {
            for (AtoAdministrativo atoAdministrativo : this.getAtosAdministrativos()){
                if (atoAdministrativo.equals(novoAtoAdministrativo)) {
                    System.out.println("Já existe um ato administrativo com esse assunto");
                    return false;
                }
            }
        }
        System.out.println("Adicionando...");
        return true;
    }

    public boolean validar(Facultativo novoAtoAdministrativo){
        if (novoAtoAdministrativo == null) {
            System.out.println("Novo ato administrativo é nulo");
            return false;
        }

        // Quando facultativo, checar se conclusões tem pelo menos 10 palavras
        if (!novoAtoAdministrativo.checarQtdPalavrasConclusao()) {
            System.out.println("Quantidade de palavras na conclusão abaixo do mínimo");
            return false;
        }

        if (!this.validar((AtoAdministrativo) novoAtoAdministrativo)) {
            return false;
        }

        return true;
    }

    public boolean validar(AgentePublico novoAgentePublico) {
        if (this.getAgentesPublicos().isEmpty()) {
            return true;
        } else {
            for (AgentePublico agentePublico : this.getAgentesPublicos()) {
                if (agentePublico.equals(novoAgentePublico)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean adicionar(Facultativo novoFacultativo){
        if (this.validar(novoFacultativo)) {
            ArrayList<AtoAdministrativo> novosAtosAdministrativos = getAtosAdministrativos();
            novosAtosAdministrativos.add(novoFacultativo);
            this.setAtosAdministrativos(novosAtosAdministrativos);
            return true;
        }
        return false;
    }

    public boolean adicionar(AtoAdministrativo novoAtoAdministrativo){
        if (this.validar(novoAtoAdministrativo)) {
            ArrayList<AtoAdministrativo> novosAtosAdministrativos = getAtosAdministrativos();
            novosAtosAdministrativos.add(novoAtoAdministrativo);
            this.setAtosAdministrativos(novosAtosAdministrativos);
            return true;
        }
        return false;
    }

    public boolean adicionar(AgentePublico agentePublico){
        if (this.validar(agentePublico)) {
            ArrayList<AgentePublico> listaAgentesPublicos = getAgentesPublicos();
            listaAgentesPublicos.add(agentePublico);
            this.setAgentesPublicos(listaAgentesPublicos);
            return true;
        }
        return false;
    }


    public AgentePublico getAgentePublicoByMatricula(String matricula) {
        for (AgentePublico agentePublico : this.getAgentesPublicos()) {
            if (agentePublico.getMatricula().equalsIgnoreCase(matricula)) {
                return agentePublico;
            }
        }
        return null;
    }
}
