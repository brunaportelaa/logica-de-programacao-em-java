import java.util.ArrayList;

/**
 * NÃO ALTERE NENHUMA LINHA DE CÓDIGO DESTA CLASSE, AO REALIZAR SEUS AJUSTES EM FEEDBACK ELA DEVE FUNCIONAR CORRETAMENTE
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<FeedBack> feedbacks = new ArrayList<>();
        FeedBack feed = new FeedBack("Foi uma atuação com ótimos pontos positos", 34);
        feedbacks.add(feed);
        feedbacks.add(new FeedBack("Precisa melhorar a sua soft skills", 80));
        feedbacks.add(new FeedBack("Precisa melhorar a sua hard skills", 57));

        for (FeedBack feedBack : feedbacks){
            System.out.println(feedBack);
        }
    }
}
