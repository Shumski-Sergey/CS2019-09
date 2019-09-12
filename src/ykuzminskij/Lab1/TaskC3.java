package ykuzminskij.Lab1;

import java.util.Scanner;

public class TaskC3 {
    public static void main (String[] args){
        System.out.println("Введите ваш вес на Земле");
        Scanner sc = new Scanner(System.in);
        double w1 = sc.nextDouble();
        double res = getWeight (w1);
        System.out.printf("Ваш вес на Марсе %.2f кг", res);
    }

    private static double getWeight (double w1) {
        double g1 = 9.81;
        double g2 = 3.86;
        return (w1/g1)*g2;
        }
}
