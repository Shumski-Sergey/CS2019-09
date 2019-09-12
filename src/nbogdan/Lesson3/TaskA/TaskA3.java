package nbogdan.Lesson3.TaskA;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа с клавиатуры");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 == num2 && num1 == num3){
            System.out.println("Все числа равны: " + num1 + " " + num2 + " " + num3);
        }else if (num1 == num2){
            System.out.println("Равны первое и второе числа: " + num1 + " " + num2);
        }else if (num1 == num3){
            System.out.println("Равны 1 и 3 числа: " + num1 + " " + num3);
        }else if (num2 == num3){
            System.out.println("Равны 2 и 3 числа: " + num2 + " " + num3);
        } else System.out.println("Все числа разные.");
    }
}