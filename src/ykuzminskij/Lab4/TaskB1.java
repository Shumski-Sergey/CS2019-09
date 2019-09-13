package ykuzminskij.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskB1 {
    public static void main (String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<>();
            for (int i=0; i<5; i++) {
                String a = sc.readLine();
                list1.add(a);
            }
            System.out.println(list1.size());
            for (String x : list1){
                System.out.println(x);
            }
        }
    }

