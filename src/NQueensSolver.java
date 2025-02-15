import java.util.ArrayList;
import java.util.List;

public class NQueensSolver {
    private int size;
    private List<List<String>> solutions;

    public NQueensSolver(int size) {
        this.size = size;
        this.solutions = new ArrayList<>();
    }

    public List<List<String>> solve() {
        Board board = new Board(size);
        backtrack(board, 0);
        return solutions;
    }

    private void backtrack(Board board, int row) {
        if (row == size) {
            solutions.add(board.getBoardState());
            return;
        }

        for (int col = 0; col < size; col++) {
            if (board.isSafe(row, col)) {
                board.placeQueen(row, col);
                backtrack(board, row + 1);
                board.removeQueen(row);
            }
        }
    }
}
