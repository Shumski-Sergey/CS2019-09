package nbogdan.Lesson1.TaskC1;
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Сумма ваших чисел = " + (a+b)); //можно как-то выполнить это сложение без создания переменной с?
    }
}
