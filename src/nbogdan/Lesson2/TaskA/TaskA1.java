package nbogdan.Lesson2.TaskA;
        import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Сумма: " + (a + b) + "\nРазность: " + (a - b) + "\nПроизведение: " + (a * b) + "\nЧастное: " + (a / b) + "\nОстаток от деления: " + (a & b));
        double a1 = a;
        double b1 = b;
        System.out.println("Сумма: " + (a1 + b1) + "\nРазность: " + (a1 - b1) + "\nПроизведение: " + (a1 * b1) + "\nЧастное: " + (a1 / b1) + "\nОстаток от деления: " + (a1 % b1));
    }
}