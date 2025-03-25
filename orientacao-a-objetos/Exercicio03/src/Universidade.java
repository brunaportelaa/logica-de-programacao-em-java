import java.util.ArrayList;

public class Universidade {
    String nome;
    Laboratorio[] laboratorios;

    public int countByResponsavel(int cargoResponsavel) {
        int counter = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            if (laboratorio.responsavel.cargo == cargoResponsavel) {
                counter++;
            }
        }
        return counter;
    }

    public Laboratorio[] sortByTipoResponsavel(int cargoResponsavel){
        int qtdLaboratorios = this.countByResponsavel(cargoResponsavel);
        Laboratorio[] selecionados = new Laboratorio[qtdLaboratorios];
        int j = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            if (laboratorio.responsavel.cargo == cargoResponsavel) {
                selecionados[j] = laboratorio;
                j++;
            }
        }
        return selecionados;
    }

    public int countItensByTipo(int tipoItens){
        int counter = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            counter += laboratorio.countByTipoItem(tipoItens);
        }
        return counter;
    }

    public double somarCusto(){
        int custoTotal = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            custoTotal += laboratorio.somarCusto();
        }
        return custoTotal;
    }


    public int countItensByLocal(String local) {
        int totalItens = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            if (laboratorio.local == local) {
                totalItens += laboratorio.itens.length;
            }
        }
        return totalItens;
    }
}

