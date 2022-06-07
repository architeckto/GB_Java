package lesson7;

public class Cat{
    private final String name;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }
    public void eat(Plate p) {
        boolean satiety = false;
        p.decreaseFood(appetite, name, satiety);
    }

}