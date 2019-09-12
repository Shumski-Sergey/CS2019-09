package nbogdan.Lesson3.TaskC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskC3 {
    private  static void table (int size){
        ArrayList<String> Units = new ArrayList<String>();
        ArrayList<String> Tens = new ArrayList<String>();
        ArrayList<String> Pzdc = new ArrayList<String>();
        Collections.addAll(Units,"один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять ", "десять ");
        Collections.addAll(Tens, "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто ");
        Collections.addAll(Pzdc, "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать ");
        int h = 1, a = 1;
        while (h <= size) {
            System.out.println(Units.get(h - 1) + "умножить на " + Units.get(a - 1) + "равно: ");
            a++;
            if (a - 1 == size) {
                h++;
                a = 1;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println();
        table(10);
    }
}
