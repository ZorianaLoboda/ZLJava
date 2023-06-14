package Homework_Siarhei_Java_LES_10;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Геттери та сеттери

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }
// МЕТОДИ

    public void eat() {
        System.out.println("Я їм!");
    }
    public void respond() {
        System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!");
    }
    public void clean() {
        System.out.println("Потрібно добре замести сліди...");
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    public String getName() {
        return nickname;
    }

    // Перевизначення методу toString()

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pet other = (Pet) obj;
        return Objects.equals(species, other.species) &&
                Objects.equals(nickname, other.nickname) &&
                age == other.age &&
                trickLevel == other.trickLevel &&
                Arrays.equals(habits, other.habits);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}

