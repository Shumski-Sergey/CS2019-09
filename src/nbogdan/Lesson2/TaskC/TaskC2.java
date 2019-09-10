package nbogdan.Lesson2.TaskC;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int s = 0, a = sc.nextInt();
        for ( ; a > 0; ) {
            s = s + (a % 10);
            a /= 10;
        }
        /* А это именно для 4 значного числа.
        for (i = 0; i < 4; i++) {
            s = s + (a % 10);
            a /= 10;
        }*/
        System.out.println("Сумма чисел этого числа: " + s);

    }

}