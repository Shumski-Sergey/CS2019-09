package nbogdan.Lesson4.TaskC;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC1 {
    private static void printList (ArrayList<Integer> list) {
        ArrayList<Integer> listX3 = new ArrayList<>();
        ArrayList<Integer> listX2 = new ArrayList<>();
        ArrayList<Integer> listStash = new ArrayList<>();
        System.out.println(list.size());
        for (Integer a : list) {
            if (a % 3 == 0 && a % 2 == 0) {
                listX3.add(a);
                listX2.add(a);
            } else if (a % 3 == 0) {
                listX3.add(a);
            } else if (a % 2 == 0) {
                listX2.add(a);
            } else {
                listStash.add(a);
            }
        }
        System.out.println("x3: " + listX3.size());
        System.out.println("x2: " + listX2.size());
        System.out.println("stash: " + listStash.size());
        System.out.println("Список чисел, кратных 3: ");
        for (Integer i : listX3) {
            System.out.println(i);
        }
        System.out.println("Список чисел, кратных 2: ");
        for (Integer i : listX2) {
            System.out.println(i);
        }
        System.out.println("Список отброшенных чисел: ");
        for (Integer i : listStash) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите с клавиатуры 20 чисел: ");
        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
        }
        printList(list);
    }
}
