/*Создать класс Tree с перегруженными конструкторами.
    В классе есть Tree есть поля:
    String type; int height, int coutOfsticks, String colour;

    Конструктор1 принимающий в параметры String type; int height
    и присваивающий значение полям coutOfsticks значение 13,
    colour "Зеленый".

    Конструктор2 принимающий в параметры int height, int coutOfsticks,
    String colour и присваивающий значение полю type "пихта".

    Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    сolour = "Желтый".

    Конструктор4 который принимает в параметры String type,
    и вызывает внутри себя конструктор 3.

    Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.
*/

package Homework_Siarhei_JAVA_LES_9;

public class Tree {
    private String type;
    private int height;
    private int countOfSticks;
    private String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Зелений";
    }
    public Tree(int height, int countOfSticks, String colour) {
        this.type = "Піхта";
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Жовтий";
    }

    public Tree(String type) {
        this();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tree: " +
                "type=" + type +
                ", height=" + height +
                ", countOfSticks=" + countOfSticks +
                ", colour=" + colour;
    }
}