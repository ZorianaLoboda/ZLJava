/*2)Пользователь вводит с клавиатуры три целочисленных значения
        На экран выводится информация можно ли из этих сторон
        построить треугольник.*/


package Homework_Siarhei_JAVA_LES_4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть три значення сторін трикутника");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if ((x + y > z) && (y + z > x) && (x + z > y)) {
            System.out.println("Можна побудувати трикутник");
        } else {
            System.out.println("Побудувати трикутник не можна");
        }
    }
}


