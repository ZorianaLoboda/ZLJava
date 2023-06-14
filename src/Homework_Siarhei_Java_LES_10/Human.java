package Homework_Siarhei_Java_LES_10;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Family family;
    private String[] schedule;

    public Human(String name, String surname, int year, int iq, Pet pet, Family family, String[] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.family = family;
        this.schedule = schedule;
    }

    // Геттери та сеттери

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    // Методи класу Human

    public void greetPet() {
        Pet pet = getPet();
        String petName = pet.getNickname();
        System.out.println("Привіт, " + petName);
    }

    public void describePet() {
        Pet pet = getPet();
        String species = pet.getSpecies();
        int age = pet.getAge();
        int trickLevel = pet.getTrickLevel();
        String trickLevelDescription = (trickLevel > 50) ? "дуже хитрий" : "майже не хитрий";
        System.out.println("У мене є " + species + ", йому " + age + " рік, він " + trickLevelDescription + ".");
    }

    // Перевизначення методу toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human{name='").append(name).append("', ");
        sb.append("surname='").append(surname).append("', ");
        sb.append("year=").append(year).append(", ");
        sb.append("iq=").append(iq).append(", ");
        sb.append("schedule=").append(Arrays.toString(schedule)).append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Human other = (Human) obj;
        return Objects.equals(name, other.name) &&
                Objects.equals(surname, other.surname) &&
                year == other.year &&
                iq == other.iq &&
                Objects.equals(pet, other.pet) &&
                Objects.equals(family, other.family) &&
                Arrays.equals(schedule, other.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
