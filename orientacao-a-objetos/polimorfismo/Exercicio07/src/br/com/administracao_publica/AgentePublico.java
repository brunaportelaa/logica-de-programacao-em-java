package br.com.administracao_publica;

public class AgentePublico {
    private String nome;
    private String matricula;

    public AgentePublico(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return  true;
        }
        if ( object == null || object.getClass() != getClass()) {
            return false;
        }
        AgentePublico agentePublico = (AgentePublico) object;
        if (agentePublico.getMatricula().equalsIgnoreCase(this.getMatricula())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome do agente público: " + this.getNome() +
                "\nMatrícula do agente público: " + this.getMatricula();
    }
}
