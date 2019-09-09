package Lab2;

import java.util.Scanner;

public class A1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c,d,e,f,g;
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.print(c+" "+d+" "+e+" "+f+" "+g+" ");

        Scanner ss = new Scanner(System.in);
        double z = ss.nextInt();
        double y = ss.nextInt();
        double x,w,u,v,t;
        x=z+y; w=z-y; u=z*y; v=z/y; t=z%y;

        System.out.print(x+" "+w+" "+u+" "+v+" "+t);
    }
}
