public class Printer {
    public static void print(Armazenamento armazenamento){
        for (Pasta pasta : armazenamento.getPastas()) {
            print(pasta);
        }
    }

    public static void print(Pasta[] pastas) {
        for (Pasta pasta: pastas) {
            print(pasta);
        }
    }

    public static void print(Pasta pasta){
        System.out.println("------PASTA------");
        System.out.println(pasta.toString());
        System.out.println("Documentos:");
        print(pasta.getDocumentos());
    }

    public static void print(Documento[] documentos) {
        for (Documento documento : documentos) {
            print(documento);
        }
    }

    public static void print(Documento documento){
        System.out.println(documento.toString());
    }
}
