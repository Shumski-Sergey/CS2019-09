package ykuzminskij.Lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String [] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        double c = a;
        double d = b;
        System.out.println((a+b) + "    " + (a-b) + "    "+ (a*b) + "    " + (a/b) + "    " +(a%b));
        System.out.println((c+d) + "    " + (c-d) + "    "+ (c*d) + "    " + (c/d) + "   " +(c%d));
    }
}
