package ru.mirea.pryazhentsevaes.pkmn;

public class Student {
    private String firstName;
    private String surName;
    private String familyName;
    private String group;

    public Student(String familyName, String firstName, String group, String surName) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.group = group;
        this.surName = surName;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String name) {
        this.surName = name;
    }

    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String name) {
        this.familyName = name;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String name) {
        this.group = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + surName + '\'' +
                ", Отчество='" + familyName + '\'' +
                ", Группа='" + group + '\'' +
                '}';
    }
}
