/*4)Создать три массива.
Первый будет состоять из следующих имен:
"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
Второй будет содержать следующие значения типа int:
10, 12, 14, 16, 18, 20.
Третий будет содержать следующие значения:
"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
Пользователь вводит три числа с клавиатуры, которые будут соответствовать
индексам каждого из элементов массивов.
Пример1. после ввода 3,2,1:
На экране должно вывестись следующее сообщение:
"Федя будет идти в магазин в 14:00"
Пример2. после ввода 1,2,3:
На экране должно вывестись следующее сообщение:
"Маша будет идти в тренажерный зал в 14:00"*/

package Homework_Siarhei_JAVA_LES_5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] name = {"Петро", "Марія", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] number = {10, 12, 14, 16, 18, 20};
        String[] routes = {"школу", "магазин", "церкву", "тренажерний зал", "кіно", "поліклініку"};
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число від 0 до 6 ");
        int x = input.nextInt();
        if (x < 0 || x >= name.length) {
            System.out.println("Невірне число");
            return;
        }
        System.out.println("Введіть число від 0 до 5 ");
        int y = input.nextInt();
        if (y < 0 || y >= number.length) {
            System.out.println("Невірне число");
            return;
        }
        System.out.println("Введіть число від 0 до 5 ");
        int z = input.nextInt();
        if (z < 0 || z >= routes.length) {
            System.out.println("Невірне число");
            return;
        }

        String names = name[x];
        Integer numbers = number[y];
        String route = routes[z];

        System.out.println(names + " буде йти в " + route + " o " + numbers + ":00");
        }
    }
