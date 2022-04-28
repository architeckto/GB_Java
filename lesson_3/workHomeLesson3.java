package lesson_3;

import java.lang.reflect.Array;
import java.util.Arrays;


public class workHomeLesson3 {

    public static void main(String[] args) {

        invertArray();
        fillArray();

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
    //System.out.println("Задание 3 ===================\n");

//Задание 4 ============================================================================================================
    //System.out.println("Задание 4 ===================\n");

//Задание 5 ============================================================================================================
    //System.out.println("Задание 5 ===================\n");

//Задание 6 ============================================================================================================
    //System.out.println("Задание 5 ===================\n");


}
