package isakalouski;

import java.util.Scanner;

public class TaskC1 {
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
        System.out.println("Сумма введённых вами чисел равна" + " " + c + ".");
    }
}
