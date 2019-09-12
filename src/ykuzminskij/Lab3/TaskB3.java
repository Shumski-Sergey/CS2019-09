package ykuzminskij.Lab3;

import java.util.Scanner;

public class TaskB3 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        int number = 0;
        int sum=0;
        while (sum<lim--){
            System.out.print((sum=sum+(++number)) + " ");
        }

    }
}
