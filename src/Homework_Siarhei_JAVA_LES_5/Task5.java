/*Есть одномерный массив из 10 элементов, заполнен-
ный случайными числами. Пользователь вводит с клавиатуры
число. Программа показывает есть ли такое число в созданном
до этого массиве.*/


package Homework_Siarhei_JAVA_LES_5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) ((Math.random() * 100));
            System.out.print(arrayInt[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число ");
        String input = scanner.nextLine();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == Integer.parseInt(input)) {
                System.out.println("Число " + input + " існує в масиві");
                return;
            }
        }
                System.out.println("Числа " + input + " не існує в масиві");
    }
}
