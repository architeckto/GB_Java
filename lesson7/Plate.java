package lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, String name, boolean satiety) {
        if (food >= n) {
            food -= n;
            satiety = true;
            System.out.println("Кот " + name + " съел " + n + " еды.");
            System.out.println("Кот " + name + " наелся = " + satiety);
        }else {
            System.out.println("Еды в тарелке слишком мало: " + food + " , коту " + name + " нужно " + n + " еды.");
            System.out.println("Кот " + name + " наелся = " + satiety);

        }
    }

    public void increaseFood(int increaseFood) {
        this.food = food + increaseFood;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }
}