package Homework_Siarhei_Java_LES_10;

public class Main {
        public static void main(String[] args) {
                // Створення домашньої тварини
                String[] petHabits = {"play", "sleep"};
                Pet childPet = new Pet("кіт", "Fluffy", 1, 3, petHabits);

                // Створення мами
                Pet motherPet = new Pet("Dog", "Bella", 5, 70, new String[]{"Walking", "Sleeping"});
                Human mother = new Human("Jane", "Doe", 1980, 80, motherPet, null, new String[]{"Working", "Carrying a child"});

                // Створення тата
                Pet fatherPet = new Pet("Cat", "Simba", 4, 60, new String[]{"Playing", "Eating"});
                Human father = new Human("John", "Doe", 1985, 85, fatherPet, null, new String[]{"Working", "Driving car"});

                // Створення дитини
                Human child = new Human("Alice", "Doe", 2005, 60, null, null, new String[]{"Sleeping", "Eating"});

                // Створення родини
                Family family = new Family(father, mother);
                family.addChild(child);

                // Надання посилання на родину та домашню тварину
                child.setFamily(family);
                child.setPet(childPet);

                // Виклик методів у дитини
                child.greetPet();
                child.describePet();

                // Виклик методів у вихованця
                childPet.eat();
                childPet.respond();
                String[] newHabits = {"run", "jump"};
                childPet.setHabits(newHabits);

                // Виведення інформації про дитину та вихованця
                System.out.println(child.toString());
                System.out.println(childPet.toString());

                // Виведення інформації про маму та тата
                System.out.println(mother.toString());
                System.out.println(father.toString());
        }
}
