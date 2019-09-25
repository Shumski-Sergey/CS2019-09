package nbogdan.Lesson5.TaskA;

import java.util.ArrayList;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;
    private ArrayList<String> dogsNames = new ArrayList<>();
    private ArrayList<Integer> dogsAges = new ArrayList<>();
    public Dog() {}
    public Dog (String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        dogsNames.add(name);
        dogsAges.add(age);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public double getPower() {
        return power;
    }
    public void setName(String name) {
        this.name = name;
        dogsNames.add(name);
    }
    public void setAge(int age) {
        this.age = age;
        dogsAges.add(age);
    }
    public void setWeight( int weight) {
        this.weight = weight;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public void show() {
        System.out.println("Имя собаки: " + name + ". Возраст собаки: " + age + " лет. " + weight + " вес, " + power + " сила.");
    }

    public double getChance(Dog dog) {
        double chance = ((0.2 * dog.getAge()) + (0.3 * dog.getWeight()) + (0.5 * dog.getPower()));
        return chance;
    }
    public boolean win(Dog dogOne, Dog dogTwo) {
        if (dogOne.getChance(dogOne) > dogTwo.getChance(dogTwo)) {return true;} else return false;
    }
}