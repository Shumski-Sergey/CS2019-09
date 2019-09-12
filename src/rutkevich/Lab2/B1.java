package Lab2;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println("Квадратное уравнение имеет формулу a(x)^2+bx+c=0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите коэфициент а");
        int a = sc.nextInt();
        System.out.println("Ведите коэфициент b");
        int b = sc.nextInt();
        System.out.println("Ведите коэфициент c");
        int c = sc.nextInt();
        int D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            int x1, x2;
            x1 = (int) ((-b + Math.sqrt(D)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(D)) / (2 * a));
            System.out.println("x1" + "=" + x1 + ";" + "x2" + "=" + x2);
        } else if (D == 0) {
            int x = (-b) / (2 * a);
            System.out.println("x" + "=" + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}

// я хз как правильно задание сделать, на это у меня ушло 1.5 часа