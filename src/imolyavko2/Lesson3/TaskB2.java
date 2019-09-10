package imolyavko2.Lesson3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения: ");
        int a = cs.nextInt(); int b = cs.nextInt(); int c = cs.nextInt();
        double disc = dis(a,b,c);
        if (disc < 0) {
            System.out.println("Отрицательный дискриминант");
        }
        else if (disc == 0){
            System.out.println(-b/(2*a));
        }
        else {
            System.out.printf("%.2f %.2f",(-b+Math.sqrt(disc)/(2*a)),(-b-Math.sqrt(disc)/(2*a)));
        }
    }
    private static double dis(int a, int b, int c){
        return b*b-(4*a*c);
    }
    }


