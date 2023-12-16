package SnakeLadder;

public class Cell {
    public int id;
    public int position;
    public Jump jump;

    public Cell(int id, int position) {
        this.id = id;
        this.position = position;
    }

    public Cell(int id, int position, Jump jump) {
        this.id = id;
        this.position = position;
        this.jump = jump;
    }
}
