package ykuzminskij.Lab3;

import java.util.Scanner;

public class TaskB1 {
    public static void main (String[] args) {
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%100!=0 && year%4==0) {System.out.println("В этом году 366 дней");} //не столетие и високосный год
        else if (year%4!=0) {System.out.println("В этом году 365 дней");} // не високосны год
        else if (year%100==0 && year%400!=0) {System.out.println("В этом году 365 дней");} //столетие и високосный год
        else {System.out.println("В этом году 366 дней");}


    }
}
