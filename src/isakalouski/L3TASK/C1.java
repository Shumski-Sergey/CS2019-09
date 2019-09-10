package isakalouski.L3TASK;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ТЕМПЕРАТУРУ В ГРАДУСАХ ЦЕЛЬСИЯ: ");
        double a = sc.nextInt();
        double b = (9*a / 5) + 32;
        System.out.println("ТЕМПЕРАТУРА В ГРАДУСАХ ФАРЕНГЕЙТА: " + b);
    }
}
