package ykuzminskij.Lab2;

import java.util.Scanner;

public class TaskC2 {
    public static void  main (String [] args) {
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Сумма цифр введённого число = " + sumDigitsInNumber(num));
    }

     public static int sumDigitsInNumber(int num){
        int sum=0;
        for (;num>0;) {
            sum += (num % 10);
            num/=10;
        }
        return sum;}
}
