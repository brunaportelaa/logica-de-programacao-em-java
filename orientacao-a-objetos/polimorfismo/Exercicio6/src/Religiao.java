import java.util.Arrays;

public enum Religiao {
    ATEU(0, "Ateu"),
    ISLAMICO(1, "Islâmico"),
    CRISTAO(2, "Cristão"),
    BUDISTA(3, "Budista"),
    JUDEU(4, "Judeu"),
    HINDU(5, "Hindu"),
    OUTRO(6, "Outro");


    public int valor;
    public String nomeReligiao;

    private Religiao(int valor, String nomeReligiao) {
        this.valor = valor;
        this.nomeReligiao = nomeReligiao;
    }

    public static Religiao getReligiaoByValor(int valor) {
        Religiao religiaoSelecionada = null;
        for (Religiao religiao : Religiao.values()) {
            if (religiao.valor == valor) {
                religiaoSelecionada = religiao;
            }
        }
        return religiaoSelecionada;
    }

    public static String getListaReligioes() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Religiao religiao : Religiao.values()) {
            stringBuilder.append("\n[" + religiao.valor + "]" + " - " + religiao.nomeReligiao);
        }
        return stringBuilder.toString();
    }
}
