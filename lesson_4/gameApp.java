package lesson_4;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class gameApp {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

        while (true) {
            humanMakeTurn(field);
            printField(field);
            if (isWinner(field, "X")){
                System.out.println("You Winner! ");
                break;
            }
            if (isDraw(field)){
            break;
            }

            aiMakeTurn(field);
            printField(field);
            if (isWinner(field, "O")){
                System.out.println("Winner is AI!");
                break;
            }
            if (isDraw(field)){
                break;
            }

        }
    }

    public static String[][] initField(int size){
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                field[i][j] = "*";
            }
        }
        return field;

    }

    public static void printField(String[][] field){
        System.out.println("\n=======");

        for (String[] strings : field) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(strings[j] + "  ");
            }
            System.out.println();
        }
        System.out.println("=======\n");
    }

    public static void humanMakeTurn(String[][] field){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field[0].length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                }else {
                    System.out.println("Данная клетка занята [" + field[x][y] + "] Повторите ваш ход!: ");
                }
            }else {
                System.out.println("Вы вышли за пределы поля. Повторите ваш ход!: ");

            }
        }
    }

    public static void aiMakeTurn(String[][] field){
        Random rn = new Random();
        while (true) {
            int x = rn.nextInt(field.length);
            int y = rn.nextInt(field.length);
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field[0].length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "O";
                    break;
                }
            }
        }
    }

    public static boolean isWinner(String[][] field, String turn) {

// Проверка победителя на поле 3*3 клетки:


        //Проверка горизонталей:
        for (String[] strings : field) {
            if (Objects.equals(strings[0], turn)) {
                if (Objects.equals(strings[1], turn)) {
                    if (Objects.equals(strings[2], turn)) {
                        return true;
                    }
                }
            }
        }



        //Проверка вертикалей:
        for (int i = 0; i < field.length; i++) {
            if (Objects.equals(field[0][i], turn)) {
                if (Objects.equals(field[1][i], turn)){
                    if (Objects.equals(field[2][i], turn)){
                        return true;
                    }
                }
            }
        }



        //Проверка диагоналей:
        boolean right = true;
        boolean left = true;
        for (int i=0; i< field.length; i++) {
            right &= (Objects.equals(field[i][i], turn));
            left &= (Objects.equals(field[field.length - i - 1][i], turn));
        }

        return right || left;


    }




// Исходный листинг с лекции:

/*
        if (

                //(field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn)) ||
                //(field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn)) ||
                //(field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn))
                ){
            return true;
        }
        else if (
                (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn)) ||
                (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn)) ||
                (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        }
        else if (
                (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) ||
                (field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn))
        ){
            return true;
        }
        else{
            return false;
        }
*/

    //Проверка на ничью:
    public static boolean isDraw(String[][] field){
        for (String[] strings : field) {
            for (int j = 0; j < field.length; j++) {
                if (strings[j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Draw! ");
        return true;
    }
}
