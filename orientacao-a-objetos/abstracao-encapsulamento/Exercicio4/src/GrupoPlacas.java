import java.sql.SQLOutput;

public class GrupoPlacas {

    private Placa[] placas;

    public Placa[] getPlacas() {
        return placas;
    }

    public void setPlacas(Placa[] placas) {
        this.placas = placas;
    }

    public boolean validarCodigo(String codigo){
        for (Placa placa : this.placas){
            if (codigo.equals(placa.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    public double calcularCustoTotal() {
        int custoTotal = 0;
        for (Placa placa : this.placas) {
            custoTotal += placa.getPreco();
        }
        return custoTotal;
    }

    public double calcularCustoPorProducaoSinal(int produzSinal) {
        int custoTotal = 0;
        if (produzSinal == 1) {
            for (Placa placa : this.placas) {
                if (placa.isProduzSinalMLP()) {
                    custoTotal += placa.getPreco();
                }
            }
        } else {
            for (Placa placa : this.placas) {
                if (!placa.isProduzSinalMLP()) {
                    custoTotal += placa.getPreco();
                }
            }
        }
        return custoTotal;
    }

    public Placa[] sortByProduzSinalMLP(int produzSinal) {
        int totalPlacas = this.countByProduzSinalMLP(produzSinal);
        Placa[] placas = new Placa[totalPlacas];
        int i = 0;
        if (produzSinal == 1) {
            for (Placa placa : this.placas) {
                if (placa.isProduzSinalMLP()) {
                    placas[i] = placa;
                    i++;
                }
            }
        } else {
            for (Placa placa : this.placas) {
                if (!placa.isProduzSinalMLP()) {
                    placas[i] = placa;
                    i++;
                }
            }
        }
        return placas;
    }

    public int countByProduzSinalMLP(int produzSinal) {
        int counter = 0;
        if (produzSinal == 1) {
            for (Placa placa : this.placas) {
                if (placa.isProduzSinalMLP()) {
                    counter++;
                }
            }
        } else {
            for (Placa placa : this.placas) {
                if (!placa.isProduzSinalMLP()) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
