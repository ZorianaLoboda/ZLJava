package Homework_Siarhei_JAVA_LES_6;

import java.util.Scanner;
import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = new int[100];// масив рандомних
        Random random = new Random();

        int[] guessedNumbers = new int[100];// масив вгаданих
        int count = 0;

        System.out.println("Let the game begin!");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(101) - 50; // генерує випадкове число
        }

        while (true) {
            System.out.println("Enter number ");
            int number = scanner.nextInt();

            for (int i = 0; i < arrayInt.length; i++) {
                /*System.out.println("The secret number is: " + arrayInt[i]); щоб глянути випадкове число */

                if (number < arrayInt[i]) {
                    System.out.println("Your number is too small. Please, try again.");
                    found = false;
                    break;
                } else if (number > arrayInt[i]) {
                    System.out.println("Your number is too big. Please, try again.");
                    found = false;
                    break;
                } else {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Congratulations " + name + "!");
                guessedNumbers[count] = number;
                count++;

                System.out.println("Your numbers: ");
                for (int x = 0; x < count; x++) {
                    System.out.print(guessedNumbers[x]); // додає вгадане в масив вгаданих
                    if (x < count - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();

                // Генерація нового числа
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = random.nextInt(101) - 50;
                }
                System.out.println("Let's continue! Enter a new number.");
            }
        }
    }
}
