package justeattakeaway;

import lombok.Data;

import java.util.Random;
import java.util.logging.Logger;

@Data
public class Game {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private int currentNumber;

    public Game() {
        this.currentNumber = new Random().nextInt(1000) + 3;
    }

    public boolean isGameOver() {
        return currentNumber <= 1;
    }

    public void playTurn(int move) {
        currentNumber = move;
        int addedNumber = getNextMove();
        logger.info("[GAME-OF-THREE][Added Number] " + addedNumber);

        currentNumber = (move + addedNumber) / 3;
        logger.info("[GAME-OF-THREE][Resulting Number] " + currentNumber);
    }

    private int getNextMove() {
        if (currentNumber % 3 == 0) {
            return 0;
        }
        if ((currentNumber - 1) % 3 == 0) {
            return -1;
        }
        return 1;
    }
}

