package imolyavko2.Lesson2;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int[] a = new int[2];
        int sum = 0;
        System.out.println("Ввод: ");
        for (int i = 0; i < 2; i++) {
            a[i] = cs.nextInt();
            sum += a[i];
                    }
        System.out.println("Sum = " + sum);
    }
    }
