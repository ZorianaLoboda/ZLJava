/*Создать класс Конспект. Класс должен содержать следующие поля:
            название предмета;
            ФИО студента;
            количество страниц;
            год выпуска;
            цвет обложки.
            Название заведения, где учится студент;*/


package Homework_Siarhei_JAVA_LES_8;
public class Konspekt {
    private String subject;
    private String student;
    private int pageCount;
    private int year;
    private String coverColor;
    private String institutionName;

    public Konspekt(String subject, String student, int pageCount, int year, String coverColor, String institutionName) {
        this.subject = subject;
        this.student = student;
        this.pageCount = pageCount;
        this.year = year;
        this.coverColor = coverColor;
        this.institutionName = institutionName;
    }

    public String getSubjectName() {
        return subject;
    }

    public void setSubjectName(String subject) {
        this.subject = subject;
    }

    public String getStudentFullName() {
        return student;
    }

    public void setStudentFullName(String student) {
        this.student = student;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
}

    /*     public static void main(String[] args) {

            Konspekt myKonspekt = new Konspekt("Тестування", "Лобода Зоряна Орестівна", 50, 2023, "Фіолетовий", "DAN.IT");
            String subject = myKonspekt.getSubjectName();
            String student = myKonspekt.getStudentFullName();
            int pageCount = myKonspekt.getPageCount();
            int year = myKonspekt.getYear();
            String coverColor = myKonspekt.getCoverColor();
            String institution = myKonspekt.getInstitutionName();
            System.out.println("Предмет: " + subject);
            System.out.println("Студент: " + student);
            System.out.println("Сторінок: " + pageCount);
            System.out.println("Рік выпуска: " + year);
            System.out.println("Колір обкладинки: " + coverColor);
            System.out.println("Академія: " + institution);
        }
    }
     */
