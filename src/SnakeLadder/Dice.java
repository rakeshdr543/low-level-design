package SnakeLadder;

public class Dice {
    public int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int roll(){
        int roll = 0;
        for (int i = 0; i < diceCount; i++) {
            roll += (int) (Math.random() * 6) + 1;

        }
return roll;

    }

}
