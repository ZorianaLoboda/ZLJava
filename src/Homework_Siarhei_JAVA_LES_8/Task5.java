/*Написати програму "стрільба по цілі".
                      Технічні вимоги:
Даний квадрат 5х5, де програма випадковим чином ставить ціль.
Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
Сам процес гри обробляється у нескінченному циклі.
гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле. Уражену ціль відзначити як x.
Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
Приклад виведення в консоль:

 0 | 1 | 2 | 3 | 4 | 5 |
 1 | - | - | - | - | - |
 2 | - | * | * | - | - |
 3 | * | - | - | * | - |
 4 | - | - | - | - | * |
 5 | * | - | * | - | - | */

 package Homework_Siarhei_JAVA_LES_8;
 import java.util.Random;
 import java.util.Scanner;
public class Task5 {
    public static void displayGameBoard(int[][] gameBoard, boolean[][] shotBoard) {
        System.out.println("  1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " ");
            for (int x = 0; x < 5; x++) {
                if (shotBoard[i][x]) {
                    if (gameBoard[i][x] == 1) {
                        System.out.print("| x ");
                    } else {
                        System.out.print("| * ");
                    }
                } else {
                    System.out.print("| - ");
                }
            }
            System.out.println("|");
        }
    }

    public static int getValidInput(String message, Scanner scanner) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Помилка. Введіть ціле число.");
            scanner.next();
            System.out.print(message);
        }
        int input = scanner.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int[][] gameBoard = new int[5][5];
        boolean[][] shotBoard = new boolean[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int row = random.nextInt(5);
            int column = random.nextInt(5);
            gameBoard[row][column] = 1;
        }

        System.out.println("All Set. Get ready to rumble!");

        while (true) {
            displayGameBoard(gameBoard, shotBoard);
            int row = getValidInput("Row number (1-5): ", scanner) - 1;
            int col = getValidInput("Column number (1-5): ", scanner) - 1;

            if (gameBoard[row][col] == 1) {
                System.out.println("You have won!");
                shotBoard[row][col] = true;
                break;
            } else {
                System.out.println("Missed!");
                shotBoard[row][col] = true;
            }
        }
        displayGameBoard(gameBoard, shotBoard);
    }
}

