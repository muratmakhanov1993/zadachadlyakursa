import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = in.nextDouble();
        System.out.println("Введите оператор (+, -, *, /):");
        char operator = in.next().charAt(0);
        System.out.println("Введите второе число:");
        double b = in.nextDouble();
        double result;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор!");
                return;
        }

        System.out.println("Результат: " + result);
    }
}