import java.util.ArrayList;

public class View {
    public static Usuario gerarUsuario(){
        Usuario usuario = new Usuario();
        usuario.getId();
        lerUsuario(usuario);
        return usuario;
    }

    public static Usuario lerUsuario(Usuario usuario){
       usuario.totalFranquias = Leitor.lerInt("Quantas franquias deseja informar?");
       usuario.franquias = lerFranquias(usuario.totalFranquias);
       return usuario;
    }

    public static ArrayList<Franquia> lerFranquias(int totalFranquias){
        ArrayList<Franquia> franquias = new ArrayList<Franquia>();
        for (int i = 0; i < totalFranquias; i++) {
            Franquia franquia = lerFranquia();
            franquias.add(franquia);
        }
        return franquias;
    }

    public static Franquia lerFranquia() {
        Franquia franquia = new Franquia();
        System.out.println("Preencha os dados da franquia: ");
        franquia.qtdGB= Leitor.lerInt("Quantidade de GB:", 1);
        franquia.diaExpiracao = Leitor.lerInt("Data mensal de expiração: ", 1, 30);
        franquia.nomeEmpresa = Leitor.lerString("Nome da empresa:");
        franquia.preco = Leitor.lerDouble("Preço da franquia: ", 0.0);
        return franquia;
    }
}
