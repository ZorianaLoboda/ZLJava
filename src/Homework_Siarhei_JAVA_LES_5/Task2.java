/*Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/

package Homework_Siarhei_JAVA_LES_5;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int original = number;
        while (number != 0) {
            int symbol = number % 10;
            reverse = reverse * 10 + symbol;
            number /= 10;
        }
        if (original == reverse) {
            System.out.println("Число є паліндромом.");
        } else {
            System.out.println("Число не є паліндромом.");
        }
    }
}

