package imolyavko2.Lesson3;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = cs.nextInt(); int b = cs.nextInt();
        int isum = a+b; int iraz = a-b;
        int ipr = a * b;
        int iost = a % b;
        System.out.println(isum+" "+iraz+" "+ipr+" "+iost);
        double dsum, draz, dpr, dost;
        dsum = a+b; draz = a-b; dpr=a*b; dost= a%b;
        System.out.println(dsum+" "+draz+" "+dpr+" "+dost);
    }
}
