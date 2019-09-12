package nbogdan.Lesson4.TaskA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные для списка: ");
        ArrayList<String>  listik = new ArrayList<String>();
        for (int i = 0; i  < listik.size() + 1 ; i++) {
            String s = sc.nextLine();
            if ((s.equals("end")) || (s.equals("END"))) {break;}
            listik.add(s);
        }
        System.out.println(Arrays.toString(listik.toArray()));

    }
}
