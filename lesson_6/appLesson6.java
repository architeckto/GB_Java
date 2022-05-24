package lesson_6;

public class appLesson6 {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("Валидные значения:");
        System.out.println("======================================");

        Cat cat1 = new Cat("Barsik", 200);
        Dog dog1 = new Dog("Jak", 500, 10);
        Dog dog2 = new Dog("Reks", 450, 6);
        System.out.println("=>  Кот " + cat1.getName() + "\n пробежал: \n" + " " + cat1.getRunCat());
        System.out.println("=>  Собака " + dog1.getName() + "\n пробежала: \n" + " " + dog1.getRunDog() + " " + "\n и " +
                "проплыла:" + " \n" + " " + dog1.getSwim());
        System.out.println("=>  Собака " + dog2.getName() + "\n пробежала: \n" + " " + dog2.getRunDog() + " " + "\n и " +
                "проплыла:" + " \n" + " " + dog2.getSwim());

        System.out.println("======================================");
        System.out.println("Невалидные значения:");
        System.out.println("======================================");

        Cat cat2 = new Cat("Pushistik", -250);
        Dog dog3 = new Dog("Strelka", 650, 15);
        System.out.println("=>  Кот " + cat2.getName() + "\n пробежал: \n" + " " + cat2.getRunCat());
        System.out.println("=>  Собака " + dog3.getName() + "\n пробежала: \n" + " " + dog3.getRunDog() + " " + "\n и" +
                " проплыла:" + " \n" + " " + dog3.getSwim());

        Cat[] cats = {cat1, cat2};
        Dog[] dogs = {dog1, dog2, dog3};
        Animals[] animals = {cat1, cat2, dog1, dog2, dog3};

        System.out.println("======================================");
        System.out.println("Вывод количества:");
        System.out.println("======================================");

        System.out.println("Котов: " + cats.length);
        System.out.println("Собак: " + dogs.length);
        System.out.println("Животных: " + animals.length);
    }

}
