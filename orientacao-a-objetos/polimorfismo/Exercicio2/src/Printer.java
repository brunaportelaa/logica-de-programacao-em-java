import java.util.ArrayList;

public class Printer {
    public static void print(ArrayList<Professor> professores) {
        for (Professor professor : professores) {
            System.out.println(professor);
            System.out.println();
        }
    }
}
