package ykuzminskij.Lab4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main (String[] args) {
        int [] m  = new int[20];
        for (int i=0; i<20; i++){
            Scanner sc = new Scanner(System.in);
            int permanentVariable = sc.nextInt();
            m [i] = permanentVariable;
        }
        int [] a = new int[10];
        int [] b = new int[10];
        for (int i=0; i<a.length; i++){
            a[i]=m[i];
        }
        int t = m.length/2;
        for (int i=0; i<10; i++, t++) {
            b[i]=m[t];
        }
        System.out.println("a = "+ Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

    }
}
