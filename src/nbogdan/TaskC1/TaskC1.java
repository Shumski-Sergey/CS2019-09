package nbogdan.TaskC1;
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        int c = a + b;
        System.out.println("Сумма ваших чисел = " + c); //можно как-то выполнить это сложение без создания переменной с?
    }
}
