package nbogdan.Lesson3.TaskB;
import java.util.Scanner;

public class TaskB3 {
    private  static void sum (int lim) {
        int sum = 0;
        int position = 1;
        do {
            /* if (sum > 0) - можно добавить к следующей строке, чтобы избавиться от 0 в начале
                             но тогда if будет бесполезно срабатывать все следующие итерации */
                System.out.print(sum + ",");
                sum = sum + position;
                position++;
        } while (sum <= lim);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите лимит");
        int limit = sc.nextInt();
        sum(limit);
    }
}
