package justeattakeaway.scan;


import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class ScanInput {
    private static ScanInput instance = null;
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private ScanInput() {
    }

    public static ScanInput getInstance() {
        if (Objects.isNull(instance)) {
            instance = new ScanInput();
        }

        return instance;
    }

    public int scanInt() {
        logger.info("------------------------------");
        logger.info("Your turn, insert a number: ");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        while (userInput < 3) {
            logger.info("Wrong input, input must be > 3");
            userInput = scanner.nextInt();
        }
        return userInput;
    }
}
