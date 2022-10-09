import java.io.InputStream;
import java.util.Scanner;

public class Main {
    private static Scanner read;

    public static void main(String[] args) {
        read = new Scanner(System.in);

        double num1;
        double num2;
        String operator;

        System.out.print("Введите первое число");
        System.out.println("");
        num1 = read.nextDouble();
        System.out.print("Введите второе число");
        System.out.println("");
        num2 = read.nextDouble();

        System.out.print("Введите действие (только слова с маленькой буквы)");
        System.out.println("");
        operator = read.next();
        if (operator.equals("умножение")) {
            System.out.println(" Ответ = " + (num1 * num2));
        }
        if (operator.equals("сложение")) {
            System.out.println("Ответ = " + (num1 + num2));
        }
        if (operator.equals("деление")) {
            System.out.println("Ответ = " + (num1 / num2));
        }
        if (operator.equals("вычитание")) {
            System.out.println("Ответ = " + (num1 - num2));
        }
    }
}