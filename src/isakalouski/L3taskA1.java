package isakalouski;

public class L3taskA1 {
    public static void main(String[] args) {
        int beernum = 99;
        String word = "бутылок (бутылки)";

        while (beernum > 0) {

            if (beernum == 1) {
                word = "бутылка";
            }
            System.out.println(beernum + " " + word + " пива на стене");
            System.out.println(beernum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beernum = beernum -1;
            if (beernum == 0) {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}
