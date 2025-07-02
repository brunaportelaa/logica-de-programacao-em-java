package br.com.administracao_publica;

import java.util.ArrayList;

public class AtoAdministrativo implements Comparable<AtoAdministrativo> {

    private final int MIN_MOTIVOS = 3;
    private AgentePublico agentePublico;
    private String assunto; //impedir duplicidade
    private ArrayList<String> motivos; //minimo 3

    public AtoAdministrativo (AgentePublico agentePublico, String assunto, ArrayList<String> motivos){
        setAgentePublico(agentePublico);
        setAssunto(assunto);
        setMotivos(motivos);
    }

    public AgentePublico getAgentePublico() {
        return agentePublico;
    }

    public void setAgentePublico(AgentePublico agentePublico) {
        this.agentePublico = agentePublico;
    }


    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public ArrayList<String> getMotivos() {
        return motivos;
    }

    public void setMotivos(ArrayList<String> motivos) {
        this.motivos = motivos;
    }

    public int contarPalavras(String string) {
        if (string.isBlank()) {
            return 0;
        }
        String[] palavras = string.split("\\s+");
        return palavras.length;
    }

    public int contarPalavras(){
        int numPalavras = contarPalavras(this.getAssunto());
        System.out.println("adicionadas as palavras do assunto:" + numPalavras);
        for (String motivo : this.getMotivos()){
            numPalavras += contarPalavras(motivo);
            System.out.println("adicionadas as palavras do motivo:" + numPalavras);
        }
        return numPalavras;
    }


    public boolean checarQtdMotivos() {
        if (this.getMotivos().size() < MIN_MOTIVOS) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return  true;
        }
        if ( object == null || object.getClass() != getClass()) {
            return false;
        }
        AtoAdministrativo atoAdministrativo = (AtoAdministrativo) object;
        if (atoAdministrativo.getAssunto().equalsIgnoreCase(this.getAssunto())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Assunto = " + this.getAssunto() + "\n"
                + this.getAgentePublico().toString();
    }

    //Ordenar os Atos pelo tamanho do Assunto
    @Override
    public int compareTo(AtoAdministrativo o) {
        if (o.getAssunto().length() > this.getAssunto().length()) {
            return 1;
        } else if (o.getAssunto().length() < this.getAssunto().length()) {
            return -1;
        } else {
            return 0;
        }
    }


}
