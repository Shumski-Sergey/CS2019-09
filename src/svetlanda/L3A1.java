package svetlanda;

import java.util.Scanner;

public class L3A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число 1 и 2");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int iv = a / b;
        int mod = a % b;
        double dsum = a + b;
        double dsub = a - b;
        double div = ((double)a)/b;
        double dmod = a % b;
        System.out.println("int = " + sum + "; " + sub + "; " + iv + "; " + mod + "; ");
        System.out.println("double = " + dsum + "; " + dsub + "; " + div + "; " + dmod + "; ");


    }
}



