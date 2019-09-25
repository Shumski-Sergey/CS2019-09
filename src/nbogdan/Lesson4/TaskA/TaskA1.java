package nbogdan.Lesson4.TaskA;
import java.util.Scanner;
public class TaskA1 {

    public static void main(String[] args) {
        int[] mass = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        for (int i = 0; i < mass.length; i++){
            mass [9 - i] = sc.nextInt();
        }
        for (int x : mass) {
            System.out.println(x);
        }
    }
}
