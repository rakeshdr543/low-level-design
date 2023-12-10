package ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(PlayingPiece piece, int row, int col) {
        if (board[row][col] == null) {
            board[row][col] = piece;
            return true;
        }
        return false;
    }

    // get free cells
    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++)
                if (board[row][col] == null)
                    freeCells.add(new Pair<>(row, col));
        }
        return freeCells;
    }

    public void printBoard() {
        System.out.println("Board:");
        for (int row = 0; row < size; row++) {
            System.out.print("|");
            for (int col = 0; col < size; col++) {
                if (board[row][col] == null)
                    System.out.print(" |");
                else
                    System.out.print(board[row][col].type + "|");
            }
            System.out.println();
        }
    }







}
