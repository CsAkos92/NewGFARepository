package CAB;

import java.util.Random;

public class CowsAndBulls {
    int randomNumber;
    String gameStatus;
    int round;

    public CowsAndBulls(int randomNumber) {
        this.randomNumber = randomNumber;
        this.gameStatus = "playing";
        this.round = 1;
    }

    public int nextRound() {
        return round++;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void finishGame() {
        this.gameStatus = "finished";
    }
}
