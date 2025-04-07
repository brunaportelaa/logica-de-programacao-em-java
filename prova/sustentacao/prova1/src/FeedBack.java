public class FeedBack {
        private final int LIMITE_SCORE_UM = 25;
        private final int LIMITE_SCORE_DOIS = 50;
        private final int LIMITE_SCORE_TRES = 75;
        private String texto;
        private double nota;

        public FeedBack(String texto, double nota){
                setTexto(texto);
                setNota(nota);

        }

        public double getNota() {
                return nota;
        }

        public void setNota(double nota) {
                this.nota = nota;
        }

        public String getTexto() {
                return texto;
        }

        public void setTexto(String texto) {
                this.texto = texto;
        }

        public String toString() {
                return "-------FEEDBACK-------\n" +
                        "FEED: " + this.texto +
                        "\nATRIBUICAO: " + this.nota +
                        "\nSCORE: " + this.getScore();
        }

        /*
            TODO
            A NOTA É UM VALOR POSITIVO DE 0 A 100, O ZERO PODE SER UM VALOR PADRÃO.
            O ESCORE É 1 PONTO PARA CADA QUARTO DA NOTA, PODENDO CHEGAR A NO MÁXIMO 4 E NO MÍNIMO 1;
         */

        public int getScore() {
                int score = (int) this.nota/25;
                return score;
        }
}
