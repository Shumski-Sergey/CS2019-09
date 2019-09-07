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
        System.out.println("BIN:"+Integer.toBinaryString(a[0])+"+"+Integer.toBinaryString(a[1])+"="+Integer.toBinaryString(sum));
        System.out.println("HEX:"+Integer.toHexString(a[0])+"+"+Integer.toHexString(a[1])+"="+Integer.toHexString(sum));
        System.out.println("OCT:"+Integer.toOctalString(a[0])+"+"+Integer.toOctalString(a[1])+"="+Integer.toOctalString(sum));
            }
}
