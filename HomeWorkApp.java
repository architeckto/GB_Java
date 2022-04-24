public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("Lesson 2.1 ");
        System.out.println("version 1");
        System.out.println(checkTwoNumbers2(11, 7));
        System.out.println("version 2");
        checkTwoNumbers(3, 27);
        System.out.println("Lesson 2.2 ");
        isPositiveOrNegative(-1);
        System.out.println("Lesson 2.3 ");
        System.out.println(isNegative(5));
        System.out.println("Lesson 2.4 ");
        printWordNTimes("I'm a QA engineer at my mom's", 7);
        System.out.println("Lesson 2.5 ");
        System.out.println(leapYearOrNo(2019));

    }

    //Задание 1 ============================================================================================================
    public static void checkTwoNumbers(int a, int b) {

        int i = a + b;
        boolean a1 = i >= 10 && i <= 20;

        if (true) {
            System.out.println("Результат проверки суммы чисел: " + i + " " + a1);
        }
    }

    public static boolean checkTwoNumbers2(int a, int b) {


        int i = a + b;
        boolean a1 = i >= 10 && i <= 20;
        System.out.println("Результат проверки суммы чисел: " + i);
        return a1;

    }

//Задание 2 ============================================================================================================

    public static void isPositiveOrNegative(int a) {

        if (a < 0) {
            System.out.println("Отрицательное число " + a);
        } else {
            System.out.println("Положительное число " + a);
        }

    }

//Задание 3 ============================================================================================================

    public static boolean isNegative(int a) {
        return a < 0;
    }

//Задание 4 ============================================================================================================

    public static void printWordNTimes(String word, int times) {

        for (int i = times; i > 0; i--) {
            System.out.println(i + " " + word);
        }
    }

//Задание 5 ============================================================================================================

    public static boolean leapYearOrNo(int y) {

        if (y % 4 == 0) {
            System.out.println(y + " является високосным годом");
            return true;
        }
        System.out.println(y + " не является високосным годом");
        return false;

    }
}