

public class View {
    /**
     * Enquanto o usuário desejar você deve permitir ele adicionar uma franquia.
     * O estagiário deve ter errado alguma coisa fique atento.
     * Altere o que for necessário para que o sistema evite franquias repetidas (mesmo código).
     * Em caso de repetição apresente uma mensagem: "Franquia já cadastrada".
     */
    public static Anatel lerAnatel(){
        Anatel anatel = new Anatel();
        boolean continuar = true;
        do {
            int opcao;
            Franquia franquiaTemp = new Franquia(Leitura.lerString("Insira o código"));
            while (!anatel.validarFranquia(franquiaTemp)){
                System.out.println("Este código já foi utilizado, por favor, tente um novo.");
                franquiaTemp = new Franquia(Leitura.lerString("Insira o código"));
            }
            anatel.adicionar(lerFranquia(franquiaTemp));
            opcao = Leitura.lerInt("Deseja continuar?\n[1] - Sim\n[2] - Não", "Valor inválido.", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        } while (continuar);
        return anatel;
    }

    public static Franquia lerFranquia(Franquia franquia) {
        franquia.nome = Leitura.lerString("Insira o nome da franquia: ");
        franquia.quantidadeGB = Leitura.lerInt("Insira o quantidade de GB: ");
        return franquia;
    }
}
