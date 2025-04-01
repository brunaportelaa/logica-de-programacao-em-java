public class Anatel {
    private Franquia[] franquias;

    public Anatel() {
        this.franquias = new Franquia[0];
    }

    public void setFranquias(Franquia[] franquia) {
        this.franquias = franquias;
    }

    public Franquia[] getFranquias(){
        return this.franquias;
    }

    public void adicionar(Franquia franquia) {
        // Toda vez que o usuário quiser adicionar uma nova franquia
        // Eu vou sobrescrever a franquia que eu tenho
        // Com uma Franquia[] com uma posição a mais
        Franquia[] novasFranquias = new Franquia[franquias.length + 1];
        novasFranquias[novasFranquias.length - 1] = franquia;
        setFranquias(novasFranquias);
    }

    public Franquia getMaisBarata(){
        Franquia maisBarata = this.franquias[0];
        for (Franquia franquia : this.franquias) {
            if (franquia.getPreco() < maisBarata.getPreco()) {
                maisBarata = franquia;
            }
        }
        return maisBarata;
    }

    public Franquia[] sortFranquiaByEmpresa(String empresa) {
        int totalFranquias = countFranquiasByEmpresa(empresa);
        int i = 0;
        Franquia[] franquiasSelecionadas = new Franquia[totalFranquias];
        for (Franquia franquia : this.franquias) {
            if (empresa.equalsIgnoreCase(franquia.getEmpresa())) {
               franquiasSelecionadas[i] = franquia;
               i++;
            }
        }
        return franquiasSelecionadas;
    }

    public int countFranquiasByEmpresa(String empresa) {
        int totalFranquias = 0;
        for (Franquia franquia : this.franquias) {
            if (empresa.equalsIgnoreCase(franquia.getEmpresa())) {
                totalFranquias++;
            }
        }
        return totalFranquias;
    }

    public double getMediaPreco() {
        int soma = 0;
        for (Franquia franquia : this.franquias) {
            soma += franquia.getPreco();
        }
        return soma / franquias.length;
    }

}
