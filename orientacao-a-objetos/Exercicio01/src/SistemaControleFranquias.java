public class SistemaControleFranquias {
    int id;
    Franquia[] franquias;

    public int gerarId() {
        int id = (int)(Math.random() * 100000);
        return id;
    }

    public double getPrecoMedio(){
        int soma = 0;
        for (Franquia franquia : this.franquias) {
            soma += franquia.preco;
        }
        return soma / this.franquias.length;
    }

    public Franquia[] sortFranquiaByGBMinimo( int gbMinimo) {
        int qtdEmpresas = this.countFranquiaByGBMinimo(gbMinimo);
        Franquia[] franquiasSelecionadas = new Franquia[qtdEmpresas];
        int i = 0;
        for (Franquia franquia : this.franquias) {
            if (franquia.qtdGB >= gbMinimo) {
                franquiasSelecionadas[i] = franquia;
                i++;
            }
        }
        return franquiasSelecionadas;
    }

    public int countFranquiaByGBMinimo(int gbMinimo) {
        int counter = 0;
        for (Franquia franquia : this.franquias) {
            if (franquia.qtdGB >= gbMinimo) {
                counter++;
            }
        }
        return counter;
    }

    public Franquia[] sortFranquiaByEmpresa(int empresa) {
        int qtdEmpresas = this.countFranquiaByEmpresa(empresa);
        Franquia[] franquiasSelecionadas = new Franquia[qtdEmpresas];
        int i = 0;
        for (Franquia franquia : this.franquias) {
            if (franquia.empresa == empresa) {
                franquiasSelecionadas[i] = franquia;
                i++;
            }
        }
        return franquiasSelecionadas;
    }

    public int countFranquiaByEmpresa (int empresa) {
        int counter = 0;
        for (Franquia franquia : this.franquias) {
            if (franquia.empresa == empresa) {
                counter++;
            }
        }
        return counter;
    }

    public Franquia selectMaisBarata() {
        Franquia maisBarata = this.franquias[0];
        for (Franquia franquia : this.franquias) {
            if (franquia.preco < maisBarata.preco) {
                maisBarata = franquia;
            }
        }
        return maisBarata;
    }



    public String toString() {
        String usuario =
                "ID: " + this.id + "\n" +
                "Total de franquias: " + this.franquias.length + "\n";
        return usuario;
    }
}
