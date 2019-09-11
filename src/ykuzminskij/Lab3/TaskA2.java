package ykuzminskij.Lab3;

import java.util.Scanner;

public class TaskA2 {
    public static void main (String [] args){
        System.out.println("Введите номер дня недели");
        Scanner sc = new Scanner(System.in);
        int numOfDay = sc.nextInt();
        switch (numOfDay) {
            case 1: System.out.println("Вы выбрали Понедельник");
                break;
            case 2: System.out.println("Вы выбрали Вторник");
                break;
            case 3: System.out.println("Вы выбрали Среду");
                break;
            case 4: System.out.println("Вы выбрали Четверг");
                break;
            case 5: System.out.println("Вы выбрали Пятницу");
                break;
            case 6: System.out.println("Вы выбрали Субботу");
                break;
            case 7: System.out.println("Вы выбрали Воскресенье");
                break;
            default: System.out.println("Нет дня недели соответствующего введённому номеру");
        }
    }
}
