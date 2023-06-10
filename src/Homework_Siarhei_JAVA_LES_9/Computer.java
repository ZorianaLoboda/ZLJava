/*
    1) Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,
    и видеокарта тип int.
    Переопределить метод toString для вывода объекта класса в след. виде:
            "Создан PC.
    Имя = марка.
            Цена = цена.
            Видеокарта = объем видеокарты
    ОЗУ = Объем оперативной памяти."

    Все поля класса Computer должны быть приватными.
    Также создайте публичные методы для получения информации о полях класса Computer.
    А также методы для изменения его полей.

    Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.

    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте.*/

package Homework_Siarhei_JAVA_LES_9;
import java.util.Objects;
public class Computer {
        private String brand;
        private int price;
        private int ram;
        private int gpu;

        public Computer(String brand, int price, int ram, int gpu) {
            this.brand = brand;
            this.price = price;
            this.ram = ram;
            this.gpu = gpu;
        }

        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public int getRam() {
            return ram;
        }
        public void setRam(int ram) {
            this.ram = ram;
        }
        public int getGpu() {
            return gpu;
        }
        public void setGpu(int gpu) {
            this.gpu = gpu;
        }

        @Override
        public String toString() {
            return "Створений PC.\n" +
                    "Марка = " + brand + ".\n" +
                    "Ціна = " + price + ".\n" +
                    "Відеокарта = " + gpu + ".\n" +
                    "ОЗУ = " + ram + ".";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Computer computer = (Computer) o;
            return ram == computer.ram &&
                    gpu == computer.gpu &&
                    Objects.equals(brand, computer.brand);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, ram, gpu);
        }
    }
