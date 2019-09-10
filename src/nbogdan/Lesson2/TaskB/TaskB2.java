package nbogdan.Lesson2.TaskB;
import java.util.Scanner;

public class TaskB2 {
    private static double dis(int a,int b,int c) {
        double x, d = ((b * b) - 4 * a * c);
        System.out.println("Дискриминант: " + d);
        if (d == 0) {
            x = (float) - b / (2 * a);
            System.out.println("Уравнение имеет 1 корень: " + x);
        } else
            if (d < 0) {
          System.out.println("Нет корней");
        } else {
                x = (- b + Math.sqrt(d)) / (2 * a);
                System.out.println("Первый корень уравнения: " + x);
                x = (- b - Math.sqrt(d)) / (2 * a);
                System.out.println("Второй корень уравнения: " + x);
            }
            int q = 1; //По сути метод здесь не нужен, просто в условии написано, что должен быть метод dis
            return q;  //так что пусть возвращает единичку
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите величины a, b, c квадратного уравнения \nA: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        dis(a, b, c);
    }

}