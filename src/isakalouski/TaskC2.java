package isakalouski;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int number1 = sc.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number1 + ".");
        System.out.println("Введите второе число.");
        int number2 = sc.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number2 + ".");
        int a = number1;
        int b = number2;
        int c = a + b;
        System.out.println("Dec: " + a + "+" + b + "=" + c );
        System.out.println ("Binary: " + Integer.toBinaryString(a) + " + " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c));
        System.out.println("Hex: " + Integer.toHexString(a) + " + " + Integer.toHexString(b) + " = " + Integer.toHexString(c));
        System.out.println("Octal: " + Integer.toOctalString(a) + " + " + Integer.toOctalString(b) + " = " + Integer.toOctalString(c));
    }
}
