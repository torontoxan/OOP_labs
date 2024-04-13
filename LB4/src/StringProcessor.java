import java.util.Scanner;

class StringProcessor {
    private String inputText;
    private String wordToFind;

    public StringProcessor(String inputText, String wordToFind) {
        this.inputText = inputText;
        this.wordToFind = wordToFind;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void processText() {
        int count = 0;
        int index = inputText.indexOf(wordToFind);
        while (index != -1) {
            count++;
            System.out.println("Слово знайдено у індексі: " + index);
            index = inputText.indexOf(wordToFind, index + 1);
        }
        if (count == 0) {
            System.out.println("Слово '" + wordToFind + "' не було знайдено.");
        } else {
            System.out.println("Загальна кількість знайдених слів '" + wordToFind + "': " + count);
        }
    }
}