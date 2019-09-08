package svetlanda;

import java.util.Scanner;

public class TaskL3B1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число 1,2,3");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int D = b * b - (4 * a * c);
        double dD = b * b - (4 * a * c);
        if (dD > 0)
            System.out.println("два корня" + (-b + Math.sqrt(dD)) / (2 * a) + ";" + (-b - Math.sqrt(dD)) / (2 * a));
        if (dD < 0) System.out.println("корней нет");
        if (dD == 0) System.out.println("один корень" + (-b / (2 * a)));

    }
}



