/*)Написать программу, которая будет считывать введенные пользователем
        слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
        пока пользователь не введет с клавитуры слово STOP.
        Все слова введенные до этого должны отобразится в консоли
        одним предложением.*/

package Homework_Siarhei_JAVA_LES_5;

import java.util.Objects;
import java.util.Scanner;
public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть слова. Для зупинки введіть STOP.");
            String word = "";
            while (true) {
                String sentence = scanner.nextLine();
                if (Objects.equals(sentence, "STOP")) {
                    break;
                }
                System.out.println (word += sentence + " ");
            }
            System.out.println("Результат: " + word.trim());
        }
    }

