package imolyavko2.Lesson3;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Введите число: ");
        int ch = cs.nextInt();
        System.out.println("Сумма цифр числа: "+sumDigitsInNumber(ch));
    }
    private static int sumDigitsInNumber(int number){
        int sum = 0;
        while (number>0) {
            sum += (number % 10);
            number = number/10;
        }
        return sum;
    }
}
