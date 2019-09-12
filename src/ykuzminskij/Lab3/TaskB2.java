package ykuzminskij.Lab3;

import java.util.Scanner;

public class TaskB2 {
    public static void main (String[] args) {
        System.out.println("Введите число от 1 до 10");
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        int size = 1;
        int size2 = 1;
        while (size<=lim){
             while (size2<11) {
                 System.out.print((size * size2++) + " ");
             }
             System.out.println();
             size++;
             size2=1;

        }

    }
}
