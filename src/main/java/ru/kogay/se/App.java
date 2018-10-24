package ru.kogay.se;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] revert = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < revert.length; i++) {
            if (revert[i] == 1) {
                revert[i] = 0;
            } else
                revert[i] = 1;
        }
        System.out.print(Arrays.toString(revert));
        System.out.println("");
        //Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
        int box = 0;
        int[] refill = new int[8];
        for (int i = 0; i < refill.length; i++) {
            refill[i] = box;
            if ((refill[i]) >= (refill[1])) {
                box = box + 3;
            }
        }
        System.out.println(Arrays.toString(refill));

        //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiplication.length; i++) {
            if (multiplication[i] < 6) {
                multiplication[i] = multiplication[i] * 2;
            }
        }
        System.out.println(Arrays.toString(multiplication));
        //Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arrA = new int[3][3];
        arrA[0][0] = 1;
        arrA[0][2] = 1;
        arrA[1][1] = 1;
        arrA[2][0] = 1;
        arrA[2][2] = 1;
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(Arrays.toString(arrA[i]));
        }

        //5.Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
        int[] element = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        int max = element[0];
        int min = element[0];
        for (int i = 0; i < element.length; i++) {
            if (element[i] > max) {
                max = element[i];
            }
            if (element[i] <= min) {
                min = element[i];
            }
        }
        System.out.println("max: " + max + " " + "min " + min);

        //задание 6.
        int[] mass = new int[6];
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                mass[0] = 1;
            }
            if (i == 1) {
                mass[1] = 3;
            }
            if (i == 2) {
                mass[2] = 2;
            }
            if (i == 3) {
                mass[3] = 1;
            }
            if (i == 4) {
                mass[4] = 2;
            }
            if (i == 5) {
                mass[5] = 11;
            }
            int p;
            int q;
            p = mass[0] + mass[1] + mass[2];
            q = mass[3] + mass[4] + mass[5];
            switch (p - q) {
                case 0:
                    System.out.println("true");
                    break;
                case 1:
                    System.out.println("false");
                    break;
                case -1:
                    System.out.println("OMG - false");
                    break;
            }
        }

    }
}
