package ykuzminskij.Lab2;

public class TaskB1 {
    public static void main (String [] args) {
        double d = 111.111;
        byte b = 0b111;
        long o = 0111; //Такой способ записи выдаёт предупреждение об ошибке "Warning:(7,18) Octal integer '0111'"
        // long o = 111L; Корретный способ записи, но не соответствует выводам из задачи
        int h = 0x111;
        float f = 111.111f;
        System.out.println(d + b + o + h + f);
        System.out.println(d +" " + b + " " + o +" "+ h +" "+ f);

    }
}
