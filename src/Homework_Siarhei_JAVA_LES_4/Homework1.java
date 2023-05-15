/*1) У вас есть строка "Я тестирую замечательно. Что еще нужно?",
Которую нужно ввести с клавиатуры в консоль.
Необходимо при помощи только  метода next() класса Scanner
(не используем метод nextLine())
присвоить перемнным типа String следующие значения:
string1 = Я
string2 = тестирую
string3 = замечательно
string4 = Что еще нужно?
Помимо string1, string2, string3, string4 новых переменных
создавать нельзя.
*/

package Homework_Siarhei_JAVA_LES_4;

import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть текст");
        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.next();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4 + " " + input.next() + " " + input.next());
    }
}