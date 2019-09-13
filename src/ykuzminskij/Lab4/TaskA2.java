package ykuzminskij.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.in;

public class TaskA2 {
    public static void main (String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> sp = new ArrayList<>();
        while (true){
            String a = sc.readLine();
            if (a.equals("end")) {System.out.println(sp);
                break;}
            sp.add(a);
       }
    }
}
