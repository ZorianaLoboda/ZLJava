 /*1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
         а также нечетные числа списком.*/

package Homework_Siarhei_JAVA_LES_8;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void printNumbers(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        System.out.println("Парні числа:");
        System.out.println(evenNumbers);

        System.out.println("Непарні числа:");
        System.out.println(oddNumbers);
    }
}
    /* public static void main(String[] args) {
        int[] myNumbers = {6, 12, 43, 64, 25, 6, 17, 98, 9, 10};
        printNumbers(myNumbers);*/


