package ykuzminskij.Lab4;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String[] args) {
        int[] arr = new int[10];
        System.out.println("Введите 10 чисел");
        for (int i = 0; i < 10; i++) {
            Scanner s = new Scanner(System.in);
            arr[i] = s.nextInt();
        }
        for (int i=9; 0 <= i; i--) {
            System.out.println(arr[i] + "\t");
            }
    }
}
