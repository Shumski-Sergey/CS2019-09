package nbogdan.Lesson5.TaskC;

import nbogdan.Lesson5.TaskA.Dog;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Dog d = new Dog();
        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();
        System.out.println("Добро пожаловать на ежедневные собачьи бои!\nВведите имя первого участника:");
        dogOne.setName(sc.nextLine());
        System.out.println("Возраст:");
        dogOne.setAge(sc.nextInt());
        System.out.println("Вес");
        dogOne.setWeight(sc.nextInt());
        System.out.println("Сила укуса");
        dogOne.setPower(sc.nextDouble());
        System.out.println("Кличка 2 участника:");
        dogTwo.setName(sc.next());
        System.out.println("Возраст:");
        dogTwo.setAge(sc.nextInt());
        System.out.println("Вес");
        dogTwo.setWeight(sc.nextInt());
        System.out.println("Сила укуса");
        dogTwo.setPower(sc.nextDouble());
        dogOne.show();
        dogTwo.show();
        System.out.println("Шансы у первой собаки: " + dogOne.getChance(dogOne));
        System.out.println("Шансы у второй: " + dogTwo.getChance(dogTwo));
        if (d.win(dogOne, dogTwo)) {
            System.out.println("Побеждает первая собака по кличке: " + dogOne.getName());
        } else System.out.println("Побеждает вторая собака по кличке: " + dogTwo.getName());
    }
}
