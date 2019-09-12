package nbogdan.Lesson3.TaskB;
import java.util.Scanner;

public class TaskB1 {
    private static int metodyear(int year) {
        if ((year % 400 != 0) && (year % 4 == 0) && (year % 100 == 0) || (year % 4 != 0)) {
            System.out.println("Год невисокосный.");
            year = 365;
            return year;
        } else {
            System.out.println("Год високосный.");
            year = 366;
            return year;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любой год нашей эры, чтобы узнать, сколько в нем дней ");
        int year = sc.nextInt();
        System.out.println(metodyear(year));
    }
}
