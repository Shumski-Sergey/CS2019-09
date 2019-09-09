package ykuzminskij.Lab2;

import java.util.Scanner;

public class TaskB2 {
    public static void main (String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        double res = dis(a, b, c);
        double a1 = a;
        double b1 = b;
        if (res > 0) {
            double x1 = (-b1 + Math.sqrt(res)) / (2 * a1);
            double x2 = (-b1 - Math.sqrt(res)) / (2 * a1);
            System.out.println("Первый корень " + x1);
            System.out.println("\n Второй корень " + x2);
        }
        else {
              if (res==0){
                  double x = (-b1 + Math.sqrt(res)) / (2 * a1);
                  System.out.println("У выражения один корен " + x);
              }
              else {
                  if (res<0) {
                      System.out.println("У выражения нет корней");
                  }
              }
        }
    }

    private static double dis (double a, double b, double c) {
        double D = b * b - 4 * a * c;
        return D;}
    }

