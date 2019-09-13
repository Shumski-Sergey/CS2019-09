package ykuzminskij.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskC1 {
    public static void main (String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Введите 20 простых чисел");
        for (int i = 0; i < 20; i++) {
            String a = sc.readLine();
            list1.add(Integer.parseInt(a));
        }
        ArrayList x3 = new ArrayList();
        ArrayList x2 = new ArrayList();
        ArrayList others = new ArrayList();

        for (int i=0; i<list1.size(); i++){
            Integer x = list1.get(i);
            if (x%3==0 || ((x%2==0) && (x%3==0))) {
                x3.add(x);
            }
            if (x%2==0 || ((x%2==0) && (x%3==0))){
                x2.add(x);
            } else if (!(x%3==0) && !(x%2==0)) {others.add(x);}
        }
        printList (x3, x2, others);
    }
    private static void printList (ArrayList x3, ArrayList x2, ArrayList others) {
        System.out.println("Числа делятся на 3 " + x3 + "\nЧисла делятся на 2 " + x2 + "\nОстальные числа " + others);
    }
}
