package aflyer.ThirdLesson;

public class Switch1 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 5; i++)
            switch (i) {
                case 0: { System.out.println(" i меньше единицы"); break; }
                case 1: { System.out.println(" i меньше двух"); break; }
                case 2: { System.out.println(" i меньше трех"); break; }
                case 3: { System.out.println(" i меньше четырех"); break; }
                case 4: { System.out.println(" i меньше пяти"); break; }
                default: System.out.println(" i равно пяти");

            }
        }
    }
