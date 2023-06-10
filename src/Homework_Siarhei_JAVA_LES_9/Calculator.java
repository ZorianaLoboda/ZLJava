/*Создать класс калькулятор.
    В нем создать методы:
    summ, minus, multiply, division.
            Сложение, вычитание, умножение и деление соответственно.
    Каждый метод принимает в качестве параметров два значения типа double.
    И выводит в консоль результат действия.

    Также в классе есть метод старт. Который выводит сообщение в консоль, что
    калькулятор запущен. И предлагает ввести действие в вашей консоли.

    Калькулятор должен принимать только следующие типы действий:
    2+4;    - пример синтаксиса сложения;
    5-6;    - пример синтаксиса вычитания;
    25*3;   - пример синтаксиса умножения;
    34/3;   - пример синтаксиса деления;
    После ввода действия на консоль выводится ответ этого действия.
    И после снова выводится сообщение о предложении ввести действие.

    в случае ввода другого синтаксисана консоль возвращается сообщение:
            "Введите корректное действие".
    И после снова выводится сообщение о предложении ввести действие.

    Программа закрывается после ввода команды Stop.
    Перед закрытием на консоль должно выводится сообщение:
    "Калькулятор закрыт".*/

package Homework_Siarhei_JAVA_LES_9;
import java.util.Scanner;
public class Calculator {
    public void start() {
        System.out.println("Калькулятор запущено");
        System.out.println("Введіть дію (наприклад, 2+4), або 'Stop' для завершення:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("Stop")) {
            performAction(input);

            System.out.println("Введіть дію, або 'Stop' для завершення:");
            input = scanner.nextLine();
        }
        System.out.println("Калькулятор закрито");
    }
        private void performAction(String input) {
            String[] numbers = input.split("([-+*/])");
            double num1 = Double.parseDouble(numbers[0]);//перше число
            double num2 = Double.parseDouble(numbers[1]);//друге число
            char operator = input.charAt(numbers[0].length());//знаходить символ в рядку "input"

            switch (operator) {
                case '+':
                    System.out.println("Результат: " + sum(num1, num2));
                    break;
                case '-':
                    System.out.println("Результат: " + minus(num1, num2));
                    break;
                case '*':
                    System.out.println("Результат: " + multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Результат: " + division(num1, num2));
                    break;
            }
        }
    // методи арифметичних дій
        private double sum(double num1, double num2) {
            return num1 + num2;
        }

        private double minus(double num1, double num2) {
            return num1 - num2;
        }

        private double multiply(double num1, double num2) {
            return num1 * num2;
        }

        private double division(double num1, double num2) {
            return num1 / num2;
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.start();
        }
    }


