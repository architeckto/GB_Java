public class HomeWorkApp {

    public static void main(String[] args) {


        printThreeWords(); //Три слова в столбик
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {

        int a = -7;
        int b = 3;

        int result = a + b;

        if (result >= 0){
            System.out.println("Сумма положительная " + result);
        }else {
            System.out.println("Сумма отрицательная " + result);
        }

    }

    public static void printColor(){

        int value = 101;

        if(value <= 0){
            System.out.println(value + " Color Red");
        }if (value > 0 && value <= 100) {
            System.out.println(value + " Color Yellow");
        }if (value > 100){
            System.out.println(value + " Color Green");
        }

    }

    public static void compareNumbers(){

        int a = 25;
        int b = 25;

        if(a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }

    }

}