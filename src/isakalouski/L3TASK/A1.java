package isakalouski.L3TASK;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число.");
        int number2 = sc.nextInt();
        int a = number1;
        int b = number2;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(c + "\t" + d + "\t" + e + "\t" + f + "\t" + g);
        double q = c;
        double w = d;
        double r = e;
        double t = f;
        double y = g;
        System.out.print(q + " ");
        System.out.print(w + " ");
        System.out.print(r + " ");
        System.out.print(t + " ");
        System.out.print(y + " ");
    }
}