package nbogdan.TaskB1;

import java.util.Scanner;

public class TaskB1 {

    public static void main(String[] args) {
        System.out.print("Напишите число, которое нужно возвести в квадрат ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println ("Квадрат этого числа: " + a*a);
    }
}
