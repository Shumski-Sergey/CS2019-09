package nbogdan.Lesson4.TaskB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int full = 0;
        System.out.println("Введите данные для списка (напишите \"end\" чтобы прекратить заполнение): ");
        ArrayList<String>  list = new ArrayList<String>();
        for (int i = 0; i  < list.size() + 1 ; i++) {
            String s = sc.nextLine();
            if (s.equals("end") || s.equals("END")) {break;}
            list.add(s);
        }
        for (String s : list) {
            full += s.length();
        }
        System.out.println("Количество строк в списке: " + list.size() + "\nОбщая длина строк в списке: " + full + "\nВсе элементы списка: ");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
