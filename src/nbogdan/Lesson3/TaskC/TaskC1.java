package nbogdan.Lesson3.TaskC;
import java.util.Scanner;

public class TaskC1 {
    private static void zp(int money){
        String[] Month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int month = 0;
        double prize = money * 1.5;
        while (month <= 14){
            if (month == 0 || month >= 13){
                System.out.println("Несуществующий месяц " + month + ", зарплата: 0$");
            }else if(month >= 6 && month <= 8){
                System.out.println(month + " месяц года (" + Month[month - 1] + "), зарплата: " + money + "$");
            }else {
                System.out.println(month + " месяц года (" + Month[month - 1] + "), зарплата: " + prize + "$");
            }
            month += 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        int money = sc.nextInt();
        if (money <300 || money > 3000){
            System.out.println("Мы вам перезвоним...");
        } else zp(money);
    }
}
