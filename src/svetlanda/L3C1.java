package svetlanda;

public class L3C1 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    private static double convertCelsiumToFahrenheit(int celsium) {

        return ((double) celsium * 9 / 5) + 32;
    }
}