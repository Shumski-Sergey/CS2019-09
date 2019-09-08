package nbogdan.Lesson2.TaskC;
import java.util.Scanner;
public class TaskC1 {
    private static double CTF(int C) {
        return (double) (C * 9 / 5) + 32; //формулу взяли
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Хей! Напиши температурку в градусах Цельсия, все сделаем, будет Фаренгейт: ");
        int c = sc.nextInt();
        double f = CTF(c);
        System.out.println("По Цельсию: " + c + "\nПо Фаренгейту: " + f);
    }

}