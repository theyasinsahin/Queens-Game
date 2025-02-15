import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 4; // Tahta boyutu
        NQueensSolver solver = new NQueensSolver(n);
        List<List<String>> solutions = solver.solve();

        System.out.println("Çözüm Sayısı: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}