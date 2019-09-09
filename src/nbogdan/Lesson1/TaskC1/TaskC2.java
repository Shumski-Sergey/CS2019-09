package nbogdan.Lesson1.TaskC1;
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        int s = a + b;
        System.out.println("Десятичный вид: " + a + " + " + b + " = " + s);
        System.out.println ("Двоичный перевод: " + Integer.toBinaryString(a) + " + " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(s));
        System.out.println("Шеснадцатиричный перевод: " + Integer.toHexString(a) + " + " + Integer.toHexString(b) + " = " + Integer.toHexString(s));
        System.out.println("Восьмиричный перевод: " + Integer.toOctalString(a) + " + " + Integer.toOctalString(b) + " = " + Integer.toOctalString(s));

    }
}
