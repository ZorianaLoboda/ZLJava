/*Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа
 и символ - или + или % или / или *.
На экран выводится резултат действия над двумя введенными числами.
Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/


package Homework_Siarhei_JAVA_LES_4;

import java.util.Objects;
import java.util.Scanner;
public class Homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть ваше число ");
        int number1 = input.nextInt();
        System.out.print("Введіть ваше число ");
        int number2 = input.nextInt();
        System.out.print("Введіть дію ");
        String symbol = input.next();
        int result = (Objects.equals(symbol, "-") ? number1-number2 : Objects.equals(symbol, "+") ? number2+number1 : Objects.equals(symbol, "%") ? number1 % number2 : Objects.equals(symbol, "/") ? number1 / number2 : Objects.equals(symbol, "*") ? number1 * number2 : 0);
        System.out.println(result);
    }
}

