package imolyavko2.Lesson5;

// import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) //throws IOException
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner cs = new Scanner(System.in);
        ArrayList<Integer> big = new ArrayList<>();
        System.out.println("Введите количество чисел: ");
        int kolvo = cs.nextInt();
        System.out.println("Введите числа: ");
        for (int i = 0; i <kolvo; i++)
        {
           // String s = reader.readLine();
           // big.add(Integer.parseInt(s));
            big.add(cs.nextInt());
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < kolvo/2 ; i++) {
            a.add(big.get(i));
            b.add(big.get(kolvo/2+i+1));
        }
        if (kolvo%2 !=0) a.add(big.get(kolvo/2));
        System.out.println("a="+a.toString());
        System.out.println("b="+b.toString());
    }
}
