/*5)(Использовать операторы if-else-if)
Пользоватьель вводит с клавиатуры числа:
Если число равно 1, то выводин на консоль "Понедельник";
Если число равно 2, то выводин на консоль "Вторник";
Если число равно 3, то выводин на консоль "Среда";
Если число равно 4, то выводин на консоль "Четверг";
Если число равно 5, то выводин на консоль "Пятница";
Если число равно 6, то выводин на консоль "Суббота";
Если число равно 7, то выводин на консоль "Воскресенье";
В противном случае выводим текст:
"Лучше бы сегодня была пятница".*/


package Homework_Siarhei_JAVA_LES_4;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число");
        int x = input.nextInt();
        if ((x == 1)) {
            System.out.println("Понеділок");
        } else if ((x == 2)) {
            System.out.println("Вівторок");
        } else if ((x == 3)) {
            System.out.println("Середа");
        } else if ((x == 4)) {
            System.out.println("Четвер");
        } else if ((x == 5)) {
            System.out.println("П'ятниця");
        } else if ((x == 6)) {
            System.out.println("Субота");
        } else if ((x == 7)) {
            System.out.println("Неділя");
        } else {
            System.out.println("Краще б сьогодні була п'ятниця");
        }
    }
}
