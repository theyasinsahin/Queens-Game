public class Block {
    private char value;
    private int x;
    private int y;
    public Block(int x, int y, char value){
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
