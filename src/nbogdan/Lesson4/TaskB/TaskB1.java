package nbogdan.Lesson4.TaskB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные для списка: ");
        ArrayList<String>  listik = new ArrayList<String>(5);
        for (int i = 0; i  < listik.size() + 1; i++) {
            String s = sc.nextLine();
            listik.add(s);
        }
        System.out.println(Arrays.toString(listik.toArray()));

    }
}
