/*
    2)Заполнить массив на 45 элементов случайными числами
    от -50 до +50. Вывести в консоль сумму всех его элементов.
    */

package Homework_Siarhei_JAVA_LES_5;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 101) - 50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // масив
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                result = result + array[i];
            }

            System.out.println("\n" + result);
        }
    }
