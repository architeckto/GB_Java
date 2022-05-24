package lesson_6;

public class Animals {
    private final String name;
    private final int run;
    private int swim;

    public Animals(String name, int run) {
        this.name = name;
        this.run = run;
    }

    public Animals(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public String getRunCat() {
        if (run > 0 && run <= 200) {
            return (run + " метров");
        }
        return ("Укажите не менее 1 и не более 200 метров!");
    }

    public String getRunDog() {
        if (run > 0 && run <= 500) {
            return (run + " метров");
        }
        return ("Укажите не менее 1 и не более 500 метров!");
    }

    public String getSwim() {
        if (swim > 0 && swim <= 10) {
            return (swim + " метров");
        }
        return ("Укажите не менее 1 и не более 10 метров!");
    }

}
