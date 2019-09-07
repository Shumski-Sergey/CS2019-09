package ykuzminskij.Lab1;
import java.util.Scanner;

public class TaskC1 {
    public static void main (String[] args) {
        String n = "n",  y;
         do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = sc.nextInt();
            System.out.println("Введите второе число");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Сумма ваших чисел" + " " + sum);
            Scanner p = new Scanner(System.in);
            System.out.println("Для продолжения нажмите любую клавишу \n Что бы выйти нажмите N");
            y = p.nextLine();
            }
        while (!y.equals (n));



    }
}
