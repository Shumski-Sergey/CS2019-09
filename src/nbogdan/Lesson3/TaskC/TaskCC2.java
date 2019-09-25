package nbogdan.Lesson3.TaskC;

import java.util.ArrayList;
import java.util.Collections;

public class TaskCC2 {
    public static void main(String[] args) {
        ArrayList kek = new ArrayList();
        Collections.addAll(kek, "Раз", "Два", "Три");
        System.out.println(kek.get(1));
        System.out.println(kek.get(2));
        System.out.println(kek.get(0));
    }
    }
