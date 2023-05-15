/*Вывести следующие сообщение в отформатированном виде (необходимо добавить спецификаторы формата):
У вас есть строка:
Число {X} больше {Y}, и это {True/False}
Вместо {X},{Y},{True/False} вставляем необходимые спецификаторы формата.
Для аргументов создаем отдельно переменные, которые запрашиваются для ввода с клавиатуры.
После ввода с клавиатуры к примеру чисел 5 и 7 должно выводиться сообщение след. типа:
       Вывод: Число 5 болшье 7, и это false.*/


package Homework_Siarhei_JAVA_LES_4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть два числа");
        int x = input.nextInt();
        int y = input.nextInt();
        boolean a = true;
        boolean b = false;
        if ((x<y)) {
            System.out.printf("Число %1$s більше %2$s, і це %3$s", x,y,b);
        };
        if ((x>y)) {
                System.out.printf("Число %1$s більше %2$s, і це %3$s", x,y,a);
        };
    }
}
