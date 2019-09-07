package imolyavko2.Lesson2;

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите вес: ");
        int ves = cs.nextInt();
        System.out.println("Вес на марсе:" + getWeight(ves));
    }
     private static double getWeight(int m){
        double mars = Math.round(m*386/9.81);
        return mars/100;
    }
}
