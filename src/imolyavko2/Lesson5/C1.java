package imolyavko2.Lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        ArrayList<Integer> another= new ArrayList<>();
        ArrayList<Integer> div3= new ArrayList<>();
        ArrayList<Integer> div2= new ArrayList<>();
        System.out.println("Введите количество чисел: ");
        int kolvo = cs.nextInt();
        System.out.println("Введите числа: ");
        for (int i = 0; i <kolvo ; i++)
        {
            int x=cs.nextInt();
            if (x%3==0) { div3.add(x);
                        if (x%2==0){ div2.add(x);}
                        continue;}
            if (x%2==0) { div2.add(x); continue;}
            another.add(x);
        }
        PrintList(div3);
        PrintList(div2);
        PrintList(another);
    }
    private static void PrintList(ArrayList<Integer> list) {
        System.out.println(list.toString());
    }
}
