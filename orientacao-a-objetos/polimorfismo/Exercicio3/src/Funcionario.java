public class Funcionario {
    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        String string = "\nNome: " + this.getNome();
        string += "\nTelefone: " + this.getTelefone();
        return string;
    }
}
