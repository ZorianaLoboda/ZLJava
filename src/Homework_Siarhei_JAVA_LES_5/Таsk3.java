/*Написать проограмму, условно для склада приема металла. Представим, что склад
        может хранить определенный вес металла. Пользователь вводит с
        клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
        с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять
        склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        о невозможности приемки такого малого веса. Программа завершается, когда
        место на складе закончилось*/

package Homework_Siarhei_JAVA_LES_5;

import java.util.Scanner;

public class Таsk3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = Integer.MAX_VALUE;
        int weight = 0;
        while (true) {
            if ((total - weight) <= 0) {
                break;
            }
            System.out.print("Скільки збираєтесь здати? ");
            int tempweight = scanner.nextInt();
            if ((tempweight < 5)) {
                System.out.println("Замала вага. Ведіть більше число.");
                System.out.println("Місця залишилось на " + (total - weight));
                continue;
            }
            if ((weight > total) || total != Integer.MAX_VALUE) {
                System.out.println("Стільки металу не можемо прийняти");
                System.out.println("Місця залишилось на " + (total - weight));
                continue;
            }
            weight = weight + tempweight;
            System.out.println("Місця залишилось на " + (total - weight));
            continue;
        }
    }
}
