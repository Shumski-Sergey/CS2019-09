package svetlanda;

import java.util.Scanner;

public class L2B1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("введите число");
                if (sc.hasNextInt()) {
            System.out.println("отлично, корень="+Math.sqrt(sc.nextInt()));
        }
            else
            System.out.println("Ошибка! введите число");
    }}



