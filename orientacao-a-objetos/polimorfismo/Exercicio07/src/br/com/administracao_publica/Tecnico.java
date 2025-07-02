package br.com.administracao_publica;

import java.util.ArrayList;

public class Tecnico extends AtoAdministrativo {

    private String notaTecnica;

    public Tecnico(AgentePublico agentePublico, String assunto, ArrayList<String> motivos, String notaTecnica) {
        super(agentePublico, assunto, motivos);
        setNotaTecnica(notaTecnica);
    }

    public Tecnico(AtoAdministrativo atoAdministrativo, String notaTecnica) {
        super(atoAdministrativo.getAgentePublico(), atoAdministrativo.getAssunto(), atoAdministrativo.getMotivos());
        setNotaTecnica(notaTecnica);
    }

    public String getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(String notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    @Override
    public int contarPalavras() {
        int numPalavras = super.contarPalavras();
        numPalavras += super.contarPalavras(notaTecnica);
        return numPalavras;
    }
}
