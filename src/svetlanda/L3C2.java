package svetlanda;

public class L3C2 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }

    private static int sumDigitsInNumber(int Number) {
        int a = Number % 10;
        int b = (Number % 100) / 10;
        int c = (Number % 1000) / 100;
        int d = (Number % 10000) / 1000;//сработал метод последовательного тыка
        return a + b + c + d;
    }
}