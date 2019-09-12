package nbogdan.Lesson3.TaskB;
import java.util.Scanner;

public class TaskB2 {
    private  static void table (int size){
        int h = 1;
        int a = 1;
        while (h <= size) {
            System.out.print(a + " ");
            a = a + h;
            if (a == (h * size)) {
                h += 1;
                System.out.print(a + "\n");
                a = h;
            }
        }
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер таблицы умножения");
        int size = sc.nextInt();
        table(size);
    }
}
