import java.util.Scanner;

public class Beec1243 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String statement = scanner.nextLine();
            int difficulty = computeDifficulty(statement);
            System.out.println(difficulty);
        }

        scanner.close();
    }

    public static int computeDifficulty(String statement) {
        String[] symbols = statement.split("\\s+");
        int totalLength = 0;
        int wordCount = 0;

        for (String symbol : symbols) {
            if (isWord(symbol)) {
                totalLength += symbol.replaceAll("\\.", "").length(); // Считаем количество букв
                wordCount++;
            }
        }

        int avgLength = wordCount > 0 ? totalLength / wordCount : 0;

        if (avgLength <= 3) {
            return 250;
        } else if (avgLength <= 5) {
            return 500;
        } else {
            return 1000;
        }
    }

    public static boolean isWord(String symbol) {
        if (symbol.matches("[a-zA-Z]+\\.?")) {
            return true;
        }
        return false;
    }
}
