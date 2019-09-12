package aflyer.SecondLesson;
import java.util.Scanner;

public class TaskB1 {
    private static double dis (int a, int b, int c){
        double dis;
        return dis = b*b-4*a*c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (dis(a,b,c)==0)
            System.out.println("В уравнении один корень, равный: " + (float)(-b/(2*a))); else
                if (dis(a,b,c)>0)
                System.out.println("В уравнении два корня, равных: " + (float)((-b+Math.sqrt(dis(a,b,c)))/(2*a)) + " и " + (float)((-b-Math.sqrt(dis(a,b,c)))/(2*a))); else
                    System.out.println("Коней нет!");
        }

}
