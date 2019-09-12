package isakalouski;

import java.util.Scanner;

public class L4taskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        if (number < 1 || number > 7) {
            System.out.println("Такого дня недели не существует!");
        }
        if (number == 1) {
            System.out.println("Понедельник");
        }
        if (number == 2) {
            System.out.println("Вторник");
        }
        if (number == 3) {
            System.out.println("Среда");
        }
        if (number == 4) {
            System.out.println("Четверг");
        }
        if (number == 5) {
            System.out.println("Пятница");
        }
        if (number == 6) {
            System.out.println("Суббота");
        }
        if (number == 7) {
            System.out.println("Воскресенье");
        }
    }
}
