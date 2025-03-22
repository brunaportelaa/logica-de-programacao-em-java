import java.util.ArrayList;

public class Usuario {
    int id;
    int totalFranquias;
    ArrayList<Franquia> franquias;

    public void getId() {
        this.id = (int)(Math.random() * 100000);
    }
}
