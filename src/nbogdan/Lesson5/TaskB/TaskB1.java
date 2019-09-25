package nbogdan.Lesson5.TaskB;

import nbogdan.Lesson5.TaskA.Dog;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DogHelper dh = new DogHelper();
        Dog dog1 = new Dog("Тявка", 3, 20, 3.4);
        Dog dog2 = new Dog("Винтик", 5, 15, 3.2);
        Dog dog3 = new Dog("Шпунтик", 2, 24, 4.0);
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        System.out.println("Придумайте имя для собаки");
        dog4.setName(sc.nextLine());
        System.out.print("Возраст:");
        dog4.setAge(sc.nextInt());
        System.out.println("Теперь имя для второй");
        dog5.setName(sc2.nextLine());
        System.out.println("Возраст?");
        dog5.setAge(sc2.nextInt());
        Dog[] dogs = new Dog[] {dog1, dog2, dog3, dog4, dog5};
        dh.printAllNames(dogs);
        System.out.print("\nСредний возраст собак: " + dh.averageAge(dogs));
    }
}
