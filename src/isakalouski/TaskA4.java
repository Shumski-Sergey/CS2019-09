package isakalouski;

import java.util.Scanner;

public class TaskA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number);
        int a = 2;
        System.out.printf("Квадрат числа" + " " + number + " " + "равен %.0f \n", Math.pow(number,a));
    }
}
