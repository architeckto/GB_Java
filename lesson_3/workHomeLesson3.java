package lesson_3;

import java.lang.reflect.Array;
import java.util.Arrays;


public class workHomeLesson3 {

    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        arrayInit(5, 10);

    }

    //Задание 1 ============================================================================================================

    public static void invertArray() {
        System.out.println("Задание 1 ===================\n");
        //Заполняем массив
        int[] arr1 = new int[70];
        for (int i = 0; i < arr1.length; i += 2) {
            arr1[i] = 0;
        }
        for (int j = 1; j < arr1.length; j += 2) {
            arr1[j] = 1;
        }
        System.out.println(Arrays.toString(arr1));
        //Инвертируем значения массива
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }

        }
        System.out.println(Arrays.toString(arr1));
    }

//Задание 2 ============================================================================================================
        public static void fillArray() {

        System.out.println("\nЗадание 2 ===================\n");
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = i + 1;
        }
            System.out.println(Arrays.toString(arr2));
 }


//Задание 3 ============================================================================================================
        public static void changeArray() {
            System.out.println("\nЗадание 3 ===================\n");

            int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println("Исходный массив:   " + Arrays.toString(arr3));
            for (int i = 0; i < arr3.length; i++){
                if(arr3[i] < 6){
                    arr3[i] = arr3[i] * 2;
                }
            }
            System.out.println("Измененный массив: " + Arrays.toString(arr3));

        }
//Задание 4 ============================================================================================================
        public static void fillDiagonal() {
            System.out.println("\nЗадание 4 ===================\n");
            int[][] arr4 = new int[5][5];
            for (int i = 0; i < arr4.length; i++){
                for (int j = 0; j < arr4.length; j++){
                    if (arr4[i] == arr4[j] ||
                            (arr4[i] == arr4[0] && arr4[j] == arr4[4] ) ||
                            (arr4[i] == arr4[1] && arr4[j] == arr4[3] ) ||
                            (arr4[i] == arr4[3] && arr4[j] == arr4[1] ) ||
                            (arr4[i] == arr4[4] && arr4[j] == arr4[0] )
                    ){
                        arr4[i][j] = 1;
                    }
                    System.out.print(arr4[i][j] + " ");
                }
                System.out.println();
            }
        }

//Задание 5 ============================================================================================================
        public static void arrayInit(int len, int initialValue) {
            System.out.println("\nЗадание 5 ===================\n");
            int [] arr5 = new int[len];
            Arrays.fill(arr5, initialValue);
            System.out.println(Arrays.toString(arr5));
        }

//Задание 6 ============================================================================================================

        public static void checkLeftMinRightMin(){
            System.out.println("\nЗадание 5 ===================\n");


        }



}
