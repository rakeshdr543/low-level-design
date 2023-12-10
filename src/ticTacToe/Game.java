package ticTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;



public class Game {
    private Board gameBoard;
    private Deque<Player> players;


    public Game() {
        this.initiliazeGame();
    }

    public void initiliazeGame() {
        // initialize board
        gameBoard = new Board(3);
        // initialize players
        players = new ArrayDeque<>();
        players.add(new Player("Player 1", PieceType.X));
        players.add(new Player("Player 2", PieceType.O));
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player currentPlayer = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.println("Player " + currentPlayer.name + "Enter row,column");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] split = s.split(",");
            int row = Integer.parseInt(split[0]);
            int col = Integer.parseInt(split[1]);
            boolean added = gameBoard.addPiece(new PlayingPiece(currentPlayer.type), row, col);
            if (!added) {
                System.out.println("Invalid move");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            boolean winner = isThereAWinner(row, col, currentPlayer.type);
            if (winner) {
                return currentPlayer.name;
            }


        }
        return "No winner";
    }

    public boolean isThereAWinner(int row, int col, PieceType type) {
        // check row
        boolean winner = true;
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].type != type) {
                winner = false;
                break;
            }
        }
        if (winner)
            return true;
        // check column
        winner = true;
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][col] == null || gameBoard.board[i][col].type != type) {
                winner = false;
                break;
            }
        }
        if (winner)
            return true;
        // check diagonal
        winner = true;
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][i] == null || gameBoard.board[i][i].type != type) {
                winner = false;
                break;
            }
        }
        if (winner)
            return true;
        // check anti diagonal
        winner = true;
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][gameBoard.size - 1 - i] == null || gameBoard.board[i][gameBoard.size - 1 - i].type != type) {
                winner = false;
                break;
            }
        }
        return winner;
    }
}
