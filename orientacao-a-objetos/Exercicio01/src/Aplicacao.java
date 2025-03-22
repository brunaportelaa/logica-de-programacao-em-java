public class Aplicacao {
    public static void main(String[] args) {
        Usuario usuario = View.gerarUsuario();
        Printer.print(usuario);
    }
}