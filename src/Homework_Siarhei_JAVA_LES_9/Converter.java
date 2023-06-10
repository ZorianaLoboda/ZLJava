/*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
    converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
    А также только один метод геттер для получения информации о названии данного конвертра.
*/

package Homework_Siarhei_JAVA_LES_9;
public class Converter {
        private String name;
        public Converter(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public int convertToInt(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введений тип boolean");
                return 0;
            } else {
                String stringValue = String.valueOf(value);
                if (isInteger(stringValue)) {
                    return Integer.parseInt(stringValue);
                } else {
                    System.out.println("Неможливо конвертувати в int");
                    return 0;
                }
            }
        }

        public double convertToDouble(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введений тип boolean");
                return 0.0;
            } else {
                String stringValue = String.valueOf(value);
                if (isNumeric(stringValue)) {
                    return Double.parseDouble(stringValue);
                } else {
                    System.out.println("Неможливо конвертувати в int");
                    return 0.0;
                }
            }
        }

        public String convertToString(Object value) {
            return String.valueOf(value);
        }
        private boolean isInteger(String value) {
            return value.matches("-?\\d+"); //перевірка на ціле число
        }
        private boolean isNumeric(String value) {
            return value.matches("-?\\d+(\\.\\d+)?");
        }
    }


