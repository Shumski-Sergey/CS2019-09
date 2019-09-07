package ykuzminskij.Lab1;
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        String n = "n", y;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = sc.nextInt();
            System.out.println("Введите второе число");
            int b = sc.nextInt();
            int res = a + b;
            System.out.println("DEC" + ":" + a + "+" +  b + "=" + res);
            System.out.println("BIN" + ":" + Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(res));
            System.out.println("HEX" + ":" + Integer.toHexString(a) + "+" + Integer.toHexString(b) + "=" + Integer.toHexString(res));
            System.out.println("OCT" + ":" + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(res));
            Scanner p = new Scanner(System.in);
            System.out.println("Для продолжения нажмите любую клавишу \n Что бы выйти нажмите N");
            y = p.nextLine();
        }
        while (!y.equals(n));
    }
}
