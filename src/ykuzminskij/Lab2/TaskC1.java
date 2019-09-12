package ykuzminskij.Lab2;

import java.util.Scanner;

public class TaskC1 {
    public static void main (String [] args) {
        System.out.println("Введите температру в градусах Цельсия");
        Scanner sc = new Scanner(System.in);
        int celsium = sc.nextInt();
        System.out.println("Темпратура в Фаренгейтах  " + convertCelsiumToFahrenheit(celsium));
    }

    public static double convertCelsiumToFahrenheit (int celsium){
        double c = celsium;
        return (c * 9 / 5) + 32;
    }
}
