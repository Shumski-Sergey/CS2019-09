package isakalouski;

import java.util.Scanner;

public class L4taskA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) { System.out.println(a + "\t" + b + "\t" + c);}

        else if (a == b) { System.out.println(a + "\t" + b);
            }
        else if (b == c) { System.out.println(b + "\r" + c);
            }
        else if (a == c) { System.out.println(a + "\t" + c);
            }
        }
    }
