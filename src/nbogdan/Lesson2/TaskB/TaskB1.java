package nbogdan.Lesson2.TaskB;
public class TaskB1 {
    public static void main(String[] args) {
        double d = 111.111;
        byte b = 0b111;
        long o = 0111L;
        int h = 0x111;
        float f = 111.111f;
        System.out.println(d + b + o + h + f);
        System.out.println(d+ " " + b + " " + o + " " + h + " " + f);

       /* Спасибо Сергею)
        А это то, что было бы, если не записывать литералы в правильном формате
        они просто складываются в строки
        double d1 = 111.111;
        byte b1 = 111;
        long o1 = 111;
        int h1 = 111;
        float f1 = (float) 111.111;
        System.out.println(d1 + b1 + o1 + h1 + f1);
        System.out.println(d1 + " " + b1 + " " + o1 + " " + h1 + " " + f1);
    */
    }

}