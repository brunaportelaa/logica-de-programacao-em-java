import java.util.ArrayList;

public class Laboratorio {
    String nome;
    Profissional responsavel;
    String local;
    Item[] itens;

    public String toString() {
        return "Nome: " + this.nome +
                "\nProfissional responsável: \n".toUpperCase() + responsavel.toString() +
                "\nLocal: " + this.local;
    }

}
