package nbogdan.Lesson3.TaskC;
import java.util.Scanner;

public class TaskCC {
    public static void main(String[] args) {
        int h1, a1, ht, at;
        int[][] table1;
        h1 = 1;
        a1 = 1;
        table1 = new int [10] [10];
        for (int i = 0; i <10; i++) {
            for (int z = 0; z < 10; z++) {
                table1[h1 - 1][i] = a1;
                a1 = a1 + h1;
                System.out.print(table1[h1 - 1][i] + " ");
            }
            h1 += 1;
            a1 = h1;
            System.out.print("\n");
        }
    }
}
