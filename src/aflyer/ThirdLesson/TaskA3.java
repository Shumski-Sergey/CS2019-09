package aflyer.ThirdLesson;

import java.util.Scanner;

public class TaskA3 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((a==b) && (b==c) && (a==c))
             System.out.print(a + " " + b + " " + c);
             else if (a==b)
                    System.out.print(a + " " + b);
                    else if (b==c)
                            System.out.print(a + " " + b);
                        else System.out.print("Нету равных чисел!");

    }
}
