package lesson7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 101);
        cats[1] = new Cat("Murzik", 50);
        cats[2] = new Cat("Musya", 35);

        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();
        System.out.println("Добавьте еды в тарелку: ");
        plate.increaseFood(scanner.nextInt());
        plate.info();
    }
}
