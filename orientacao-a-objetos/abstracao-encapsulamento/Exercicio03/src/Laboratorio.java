public class Laboratorio {
    String nome;
    Profissional responsavel;
    String local;
    Item[] itens;

    public int countByTipoItem(int tipoItem) {
        int counter = 0;
        for (Item item : this.itens) {
            if (item.tipo == tipoItem) {
                counter++;
            }
        }
        return counter;
    }

    public double somarCusto(){
        int custoTotal = 0;
        for (Item item : this.itens) {
            custoTotal += item.preco;
        }
        return custoTotal;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "\nProfissional responsável: \n".toUpperCase() + responsavel.toString() + "\n" +
                "\nLocal: " + this.local + "\n";
    }

    public int countItens() {
        return this.itens.length;
    }
}
