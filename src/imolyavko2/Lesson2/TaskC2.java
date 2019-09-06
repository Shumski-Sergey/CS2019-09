package imolyavko2.Lesson2;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int[] a = new int[2]; int sum = 0;
        System.out.println("Ввод:");
        for (int i = 0; i < 2; i++) {
           a[i] = cs.nextInt();
            sum += a[i];
        }
        System.out.println("DEC:"+a[0]+"+"+a[1]+"="+sum);
        String con1 = Integer.toBinaryString(a[0]);
        String con2 = Integer.toBinaryString(a[1]);
        String con3 = Integer.toBinaryString(sum);
        System.out.println("BIN:"+con1+"+"+con2+"="+con3);
        con1 = Integer.toHexString(a[0]);
        con2 = Integer.toHexString(a[1]);
        con3 = Integer.toHexString(sum);
        System.out.println("HEX:"+con1+"+"+con2+"="+con3);
        con1 = Integer.toOctalString(a[0]);
        con2 = Integer.toOctalString(a[1]);
        con3 = Integer.toOctalString(sum);
        System.out.println("OCT:"+con1+"+"+con2+"="+con3);
            }
}
