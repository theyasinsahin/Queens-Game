import java.util.ArrayList;
import java.util.List;
class Board {
    private int size;
    private int[] queens; // queens[i] -> i. satırdaki vezirin sütun konumu

    public Board(int size) {
        this.size = size;
        this.queens = new int[size];
    }

    public boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == row - i) {
                return false;
            }
        }
        return true;
    }

    public void placeQueen(int row, int col) {
        queens[row] = col;
    }

    public void removeQueen(int row) {
        queens[row] = 0;
    }

    public List<String> getBoardState() {
        List<String> board = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            StringBuilder sb = new StringBuilder(".".repeat(size));
            sb.setCharAt(queens[row], 'Q');
            board.add(sb.toString());
        }
        return board;
    }
}