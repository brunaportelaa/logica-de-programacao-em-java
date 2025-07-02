package br.com.administracao_publica;

import java.util.ArrayList;

public class Facultativo extends AtoAdministrativo {

    private final int MIN_PALAVRAS_CONCLUSAO = 10;
    private String conclusao; //minimo 10 palavras

    public Facultativo(AgentePublico agentePublico, String assunto, ArrayList<String> motivos, String conclusao) {
        super(agentePublico, assunto, motivos);
        setConclusao(conclusao);
    }

    public Facultativo(AtoAdministrativo atoAdministrativo, String conclusao) {
        super(atoAdministrativo.getAgentePublico(), atoAdministrativo.getAssunto(), atoAdministrativo.getMotivos());
        setConclusao(conclusao);
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public int contarPalavras() {
        int numPalavras = super.contarPalavras();
        numPalavras += super.contarPalavras(conclusao);
        return numPalavras;
    }

    public boolean checarQtdPalavrasConclusao(){
        System.out.println(contarPalavras(this.getConclusao()));
        if (contarPalavras(this.getConclusao()) < MIN_PALAVRAS_CONCLUSAO) {
            return false;
        }
        return true;
    }
}
