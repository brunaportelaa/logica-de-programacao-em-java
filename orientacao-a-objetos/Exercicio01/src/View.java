public class View {
    public static Usuario gerarUsuario(){
        Usuario usuario = new Usuario();
        usuario.getId();
        View.lerUsuario(usuario);
        return usuario;
    }

    public static Usuario lerUsuario(Usuario usuario){
       usuario.totalFranquias = Leitor.lerInt("Quantas franquias deseja informas?");

       return usuario;
    }
}
