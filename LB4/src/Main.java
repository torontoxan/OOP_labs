import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        System.out.println("Введіть слово яке потрібно знайти:");
        String wordToFind = scanner.next();

        StringProcessor processor = new StringProcessor(inputText, wordToFind);
        processor.processText();

        scanner.close();
    }
}