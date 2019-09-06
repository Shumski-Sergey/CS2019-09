package svetlanda;

import java.util.Scanner;

public class TaskB1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
                System.out.println("введите число");
                if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("отлично, корень =");
        }
            else
            System.out.println("Ошибка! введите число");
    }}



