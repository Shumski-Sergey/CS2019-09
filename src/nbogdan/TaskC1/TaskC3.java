package nbogdan.TaskC1;
import java.util.Scanner;
public class TaskC3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вес человека на земле в кг: ");
        int v = in.nextInt();
        System.out.println("НУ А НА МАРСЕ БУДЕТ: " + ves(v) + " кг");
    }

    private static double ves(int zem){
        double a = zem*(3.86/9.81);
        a=Math.round(a*100) * 0.01;
        return a;
        //ЫАЫАЫАЫАЫАЫА ДА, ДА! ТЕПЕРЬ Я ЗНАЮ ЧТО ТАКОЕ МЕТОД.
        //Чтобы понять, что не существует функции и метода getWeight, я потратил час.
    }
}