package SnakeLadder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    public Board board;
    public Dice dice;
    public Deque<Player> players;

    public Game() {
      this.intializeGame();
    }

    public void intializeGame(){
        board = new Board(100, 5, 5);
        dice = new Dice(1);
        players = new ArrayDeque<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
    }

    public String startGame(){
        while(true){
            Player currentPlayer = players.removeFirst();
            System.out.println("Player " + currentPlayer.id + " position " + currentPlayer.position);
            int roll = dice.roll();
            int newPosition = currentPlayer.position + roll;
            if(newPosition > 100){
                return currentPlayer.id;
}

            Cell cell = board.getCell(newPosition);
            if(cell.jump != null){
                newPosition = cell.jump.end;

                System.out.println("Player " + currentPlayer.id +
                        (cell.jump.start>cell.jump.end? " bit by snake":" climbed ladder"));
            }
            currentPlayer.position = newPosition;
            System.out.println("Player " + currentPlayer.id + " position " + currentPlayer.position);
            players.addLast(currentPlayer);
            if(newPosition == 100){
                return currentPlayer.id;
            }
        }
    }
}
