import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private double a, b, x, y, z;

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        inputValues();
        calculateR();
        calculateS();
        print();
        printDateTime();
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення x:");
        x = scanner.nextDouble();
        System.out.println("Введіть значення y:");
        y = scanner.nextDouble();
        System.out.println("Введіть значення z:");
        z = scanner.nextDouble();
    }

    public void calculateR() {
        a = 2 * Math.cos(x - Math.PI / 6) / (0.5 + Math.pow(Math.sin(y), 2));
    }

    public void calculateS() {
        b = 1 + (Math.pow(z, 2) / (3 + (Math.pow(z, 2) / 5)));
    }

    public void print() {
        System.out.println("Результат обчислень:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void printDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        Date date = new Date();
        System.out.println("Поточна дата і час: " + formatter.format(date));
    }
}