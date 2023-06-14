package Homework_Siarhei_Java_LES_10;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
        private Human father;
        private Human mother;
        private List<Human> children;

        // Конструктор

        public Family(Human father, Human mother) {
            this.father = father;
            this.mother = mother;
            this.children = new ArrayList<>();

            // Встановлення посилань на поточну родину для батьків
            if (father != null) {
                father.setFamily(this);
            }
            if (mother != null) {
                mother.setFamily(this);
            }
        }

        // Метод додавання дитини

        public void addChild(Human child) {
            // Додавання дитини до списку дітей
            children.add(child);

            // Встановлення посилання на поточну родину для дитини
            child.setFamily(this);
        }

        // Метод видалення дитини за індексом

        public boolean deleteChild(int index) {
            if (index >= 0 && index < children.size()) {
                Human child = children.remove(index);
                child.setFamily(null);
                return true;
            }
            return false;
        }
    // Метод отримання кількості осіб у сім'ї

    public int countFamily() {
        int count = 2;

        count += children.size();

        return count;
    }

        // Геттери і сеттери

        public Human getFather() {
            return father;
        }

        public void setFather(Human father) {
            this.father = father;
        }

        public Human getMother() {
            return mother;
        }

        public void setMother(Human mother) {
            this.mother = mother;
        }

        public List<Human> getChildren() {
            return children;
        }

        public void setChildren(List<Human> children) {
            this.children = children;
        }

        // Перевизначення методу toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family{");
        sb.append("father=").append(father);
        sb.append(", mother=").append(mother);
        sb.append(", children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}






