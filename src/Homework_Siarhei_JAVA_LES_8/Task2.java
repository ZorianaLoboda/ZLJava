/*Написать перегруженный метод, который может:
         - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
         "Я пустой".
         - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
         - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
         через пробел.
         - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
         массива.
         - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
         "Ваше сообщение - "%%%%%%%%", ваше число -  $",
         где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

package Homework_Siarhei_JAVA_LES_8;
public class Task2 {
        public static void printMessage() {
            System.out.println("Я пустий");
        }

        public static void printMessage(String message) {
            System.out.println(message);
        }

        public static void printArray(String[] messages) {
            StringBuilder sb = new StringBuilder();
            for (String message : messages) {
                sb.append(message).append(" ");
            }
            System.out.println(sb.toString());
        }

        public static void printIntArray(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Разом: " + sum);
        }

        public static void printAll(int number, String message) {
            System.out.println("Ваше повідомлення - \"" + message + "\", ваше число - " + number);
        }

        public static void main(String[] args) {
            printMessage();
            printMessage("Але вмію");

            String[] messages = {"Додавати", "числа"};
            printArray(messages);
            int[] numbers = {1, 2, 3, 4, 5};
            printIntArray(numbers);

            int myNumber = 15;
            String myMessage = "Я молодець!";
            printAll(myNumber, myMessage);
        }
    }
