package nbogdan.Lesson4.TaskB;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> bigList = new ArrayList<>(20);
        ArrayList<Integer> firstList = new ArrayList<>(10);
        ArrayList<Integer> secondList = new ArrayList<>(10);
        System.out.println("Введите желаемый размер для списка, который разделится (число должно быть четным!)");
        int size = sc.nextInt();
        if (size % 2 != 0) {
            System.out.println("Идите гуглить, что такое четные числа");
        } else {
            System.out.println("Введите " + size + " целых чисел");
            for (int i = 0; i < size; i++) {
                int s = sc.nextInt();
                bigList.add(s);
            }
            for (int i = 0; i < bigList.size(); i++) {
                if (i < (bigList.size() / 2)) {
                    firstList.add(bigList.get(i));
                } else {
                    secondList.add(bigList.get(i));
                }
            }
            System.out.println("Первый список: " + firstList.toString() + "\nВторой список: " + secondList.toString());
        }
    }
}
