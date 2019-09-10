package Lab1;

import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш вес на земле: ");
        int ves = sc.nextInt();
        System.out.println("Ваш вес на марсе:" + getWeight(ves));
    }
    private static double getWeight(int m){
        double mars = Math.round(m*3.86/9.81);
        return mars;
    }
}

//почти нихрена не поняла (переменная m)