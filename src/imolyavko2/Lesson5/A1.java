package imolyavko2.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 10 чисел: ");
        for (int i=0; i<10; i++)
        {
           String s= reader.readLine();
            list.add(s);
        }
        for (int j=9; j>=0; j--){
            System.out.println(list.get(j));
        }
    }
}
