package SnakeLadder;

public class Board {
    public Cell[] cells;
    public Dice dice;
    public Player[] players;

    public Board(int size, int snakeCount, int ladderCount) {
        cells = new Cell[size];
for (int i = 0; i < size; i++) {
            cells[i] = new Cell(i, i);
        }

        addSnakes(snakeCount);
        addLadders(ladderCount);


    }



    public void addSnakes(int snakeCount){
        while (snakeCount > 0) {
            int end = (int) (Math.random() * cells.length);
            int start = (int) (Math.random() * cells.length);
            if (start > end) {
                cells[start].jump = new Jump(start, end);
                snakeCount--;
            }
        }

    }

    public void addLadders(int ladderCount){
        while (ladderCount > 0) {
            int start = (int) (Math.random() * cells.length) + 1;
            int end = (int) (Math.random() * cells.length) + 1;
            if (start < end) {
                cells[start].jump = new Jump(start, end);
                ladderCount--;
            }
        }

    }

    public Cell getCell(int position){
        return cells[position];
    }

}
