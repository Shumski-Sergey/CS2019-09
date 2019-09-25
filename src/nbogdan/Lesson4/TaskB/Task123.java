package nbogdan.Lesson4.TaskB;

import java.util.ArrayList;
import java.util.Collections;

public class Task123 {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 0, 1, 2, 3, 4, 5);
        for (int t: list) {
            System.out.print(t + " ");
        }
    }
}
