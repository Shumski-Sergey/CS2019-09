package svetlanda;

import java.util.Scanner;

public class L2C1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите число1");
        a = sc.nextInt();
        System.out.println("Введите число2");
        b = sc.nextInt();
        c = a + b;
        System.out.println("DEC=" + c);
        System.out.println("BIN=" + (Integer.toBinaryString(c)));
        System.out.println("OCT=" + (Integer.toOctalString(c)));
        System.out.println("HEX=" + (Integer.toHexString(c)));
    }

}
