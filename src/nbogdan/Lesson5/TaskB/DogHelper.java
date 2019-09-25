package nbogdan.Lesson5.TaskB;

import nbogdan.Lesson5.TaskA.Dog;

public class DogHelper {

    void printAllNames (Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
    }
    double averageAge (Dog[] dogs) {
        double avAge = 0.0, n = 0.0;
        for (Dog dog : dogs) {
            avAge += dog.getAge();
            n++;
        }
        return (avAge / n);
    }
}
