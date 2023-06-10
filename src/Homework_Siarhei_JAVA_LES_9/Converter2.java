package Homework_Siarhei_JAVA_LES_9;

public class Converter2 {
        public static void main(String[] args) {
            Converter converter = new Converter("Мій конвертер");

            int intValue = converter.convertToInt(13);
            System.out.println("intValue: " + intValue);

            double doubleValue = converter.convertToDouble(3.14);
            System.out.println("doubleValue: " + doubleValue);

            String stringValue = converter.convertToString(true);
            System.out.println("stringValue: " + stringValue);

            String converterName = converter.getName();
            System.out.println("Назва конвертера: " + converterName);
        }
    }
