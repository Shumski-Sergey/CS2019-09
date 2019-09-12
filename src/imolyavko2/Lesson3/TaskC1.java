package imolyavko2.Lesson3;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
      Scanner cs = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        int tc = cs.nextInt();
        System.out.printf("Температура в Фаренгейтах %.1f", convertCelsiumToFarenheit(tc));
        }
     private static double convertCelsiumToFarenheit(int celsium){
         return (double) celsium*9/5+32;
}
}
