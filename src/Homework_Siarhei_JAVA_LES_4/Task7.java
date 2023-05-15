/*Используя оператор switch написать программу, которая выводит на
        консоль ссылку для скачивания программы.
        Из выбора программ взять: IntelliJ IDEA, Git, Java.
        Из выбора ОС взять: Linux, macOS, Windows.
        Программа должна спросить пользователя какая программа ему интересна,
        также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        Если программа с таким названием не существует выводит сообщение в консоль, о том
        что такой программы не существует.
        Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
        что такой ОС не существует.*/

package Homework_Siarhei_JAVA_LES_4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner myFavScanner = new Scanner(System.in);
        System.out.println("Виберіть програму");
        String program = myFavScanner.nextLine();
        switch (program) {
            case ("IntelliJ IDEA"):
            case ("Git"):
            case ("Java"):
                System.out.println("Виберіть ОС");
                String os = myFavScanner.nextLine();
                switch (os) {
                    case ("Linux"):
                    case ("macOS"):
                    case ("Windows"):
                        System.out.println("Посилання на завантаження " + program);
                    break;
                    default:
                        System.out.println("Такої OС не існує");
                }
                break;
            default:
                System.out.println("Такої програми не існує");
        }
    }
}


