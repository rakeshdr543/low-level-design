import ticTacToe.Game;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Tic Tac Toe
        Game game = new Game();
        String winner = game.startGame();
        System.out.println("Winner is " + winner);
    }
}