/* Пользователь задает размерность двумерного массива с клавиатуры.
    Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.
    */

    package Homework_Siarhei_JAVA_LES_8;
    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;
public class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Рядків в масиві: ");
            int rows = scanner.nextInt();
            System.out.print("Стовпців в масиві: ");
            int columns = scanner.nextInt();

            int[][] Array = new int[rows][columns];

            Random random = new Random();
            for (int i = 0; i < rows; i++) {
                for (int y = 0; y < columns; y++) {
                    Array[i][y] = random.nextInt(1001);
                }
            }

            /* System.out.println("Двомірний масив:");
            for (int[] row : Array) {
                System.out.println(Arrays.toString(row));
            }
             */

            int[] maxValuesArray = new int[rows];
            for (int i = 0; i < rows; i++) {
                int max = Array[i][0];
                for (int x = 1; x < columns; x++) {
                    if (Array[i][x] > max) {
                        max = Array[i][x];
                    }
                }
                maxValuesArray[i] = max;
            }
            System.out.println("Одномірний масив з максимальними значеннями:");
            System.out.println(Arrays.toString(maxValuesArray));
        }
    }
