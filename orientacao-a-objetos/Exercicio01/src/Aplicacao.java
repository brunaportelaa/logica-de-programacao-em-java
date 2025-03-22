public class Aplicacao {
    public static void main(String[] args) {
        // Franquia gerada pelo usuário
        Usuario usuario = View.gerarUsuario();
        Printer.print(usuario);
    }
}
