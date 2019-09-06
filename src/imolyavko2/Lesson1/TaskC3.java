package imolyavko2.Lesson1;

public class TaskC3 {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length()-8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String hex = Integer.toHexString(i);
            String oct = Integer.toOctalString(i);
            System.out.printf("%8s %4s %4d %4s %n", binary, oct, i,  hex);
        }
    }
}
