/*Пользователь вводит с клавиатуры свой год рождения.
На консол выводится информация о его возрасте.
Используем класс Date как на занятии.
(P.s пока не затрагиваем момент месяца рождения,
останавливаемся только на разнице лет. Если вам
вдруг понадобится преобразовать тип String в int,
то можете воспользоватьсятакой конструкцией Integer.parseInt(строка для преобразования).*/


package Homework_Siarhei_JAVA_LES_4;

import java.util.Date;
import java.util.Scanner;

import static java.time.temporal.TemporalQueries.localDate;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть ваш рік народження:");
            int x = input.nextInt();
        Date date = new Date();
        String formattedDate = String.format("%1$tY", date);
            int i = Integer.parseInt(formattedDate);
        System.out.println(i - x);
    }
}
