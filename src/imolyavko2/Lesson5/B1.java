package imolyavko2.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < 5; i++)
        {
        String s = reader.readLine();
        list.add(s);
        }
        System.out.println("Вы ввели "+list.size()+" строк");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
