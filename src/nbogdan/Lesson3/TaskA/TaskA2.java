package nbogdan.Lesson3.TaskA;
import java.util.Scanner;
public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int number = sc.nextInt();
        if (number >= 1 && number <= 7){
            switch (number){
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
            }
            }
         else {
        System.out.println("Такого дня недели не существует");
    }
    }

}