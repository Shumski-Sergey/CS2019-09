package isakalouski;

import java.util.Scanner;

public class L4taskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String v = "Количество дней в году : 366";
        String n = "Количество дней в году : 365";
        if (a % 400 == 0) {
            System.out.println(v);
        } else if (a % 4 == 0 && a % 100 != 0) {
            System.out.println(v);
        }
        else {
            System.out.println(n);
        }
    }
}
