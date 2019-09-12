package nbogdan.Lesson4;
import java.util.Scanner;

public class TaskA11 {

    public static void main(String[] args) {
        int[] mass = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        for (int i = 0; i < mass.length; i++){
            mass [9 - i] = sc.nextInt();
        }
        for (int value : mass) {
            System.out.println(value);
        }
    }
}
