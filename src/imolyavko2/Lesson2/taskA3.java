package imolyavko2.Lesson2;

public class taskA3 {
    public static void main(String[] args) {
        int i=2;
        int j=3;
        int k=(i+=1)*i+(j+=1)*j;
        System.out.println(i+"*"+i+"+"+j+"*"+j+"="+k);
    }
}
