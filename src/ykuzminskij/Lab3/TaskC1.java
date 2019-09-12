package ykuzminskij.Lab3;

import java.util.Scanner;

public class TaskC1 {
    public static void main (String[] args) {
        int month = 0;
        System.out.println("Какую вы хотите зарплату в $$$ ?");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (!(!(salary < 300) && !(salary > 3000))) {
            System.out.println("Мы вам перезвоним");
        }else
            //done:
                    while (month<=14) {
                if (month==0 || month>12){
                    System.out.println(month + " Ваша зарплата равна 0");
                }  else if (month>5 && month<9 && salary!=666 && salary!=444){
                    switch (month) {
                        case 6:
                            System.out.println(month + " Июнь - Ваша зарплата " + salary);
                            break;
                        case 7:
                            System.out.println(month + " Июль - Ваша зарплата " + salary);
                            break;
                        case 8:
                            System.out.println(month + " Август - Ваша зарплата " + salary);
                            break;
                            }
                    } else if (salary!=444) System.out.println(month + " Ваша зарплата " + (salary + salary * 0.5));
                //else break;
                month++;
                }
    }
}

