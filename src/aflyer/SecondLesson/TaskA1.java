package aflyer.SecondLesson;

import java.util.Scanner;

public class TaskA1 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число А");
    int a = sc.nextInt();
    System.out.println("Введите число В");
    int b = sc.nextInt();
    System.out.println((a+b) + " " + (a-b) + "  " + (a*b) + "  " + (a/b) + "  " + (a%b));
    double c = (double)(a); double d = (double)(b);
    System.out.println((c+d) + " " + (c-d) + "  " + (c*d) + "  " + (c/d) + "  " + (c%d));


}
}
