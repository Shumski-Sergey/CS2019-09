package imolyavko2.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите строку(и), для завершения ввода введите end :");
        while (true) {
        String s = reader.readLine();
        if (s.equals("END")||s.equals("end")) break;
        list.add(s);
        }
        System.out.println(list.toString());
    }
}
