import Logger.InfoLogProcessor;
import Logger.LogProcessor;
import Logger.WarningLogProcessor;
import Logger.ErrorLogProcessor;
import ticTacToe.Game;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Logger (Chain of Responsibility)
        LogProcessor logger = new InfoLogProcessor(new WarningLogProcessor(new ErrorLogProcessor(null)));
        logger.processLog(LogProcessor.Info, "This is an info message");
        logger.processLog(LogProcessor.Warning, "This is a warning message");
        logger.processLog(LogProcessor.Error, "This is an error message");



        // Tic Tac Toe
//        Game game = new Game();
//        String winner = game.startGame();
//        System.out.println("Winner is " + winner);
    }
}