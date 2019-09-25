package nbogdan.Lesson4.TaskC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        for (int i = 0; i < 5; i++) {list.add(sc.nextInt());}
        Collections.sort(list);
        Collections.reverse(list);
        for (Integer i: list) {System.out.println(i);}
    }
}
