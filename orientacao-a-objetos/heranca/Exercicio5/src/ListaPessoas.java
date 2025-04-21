import java.util.ArrayList;

public class ListaPessoas extends ArrayList<Pessoa>{


    @Override
    public boolean add(Pessoa novaPessoa) {
        for (Pessoa pessoa : this) {
            if (novaPessoa.equals(pessoa)) {
                return false;
            }
        }
        return super.add(novaPessoa);
    }

    @Override
    public String toString() {
        String string = "";
        for (Pessoa pessoa : this) {
            string += ("\n\n" + pessoa.toString());
        }
        return string;
    }
}
