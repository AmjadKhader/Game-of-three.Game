package justeattakeaway;

import lombok.Data;

import java.util.Random;

@Data
public class Game {
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
        System.out.println("[GAME-OF-THREE][Added Number] " + addedNumber);

        currentNumber = (move + addedNumber) / 3;
        System.out.println("[GAME-OF-THREE][Resulting Number] " + currentNumber);
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

