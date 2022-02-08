package com.company;

public class Instructor {
    private String name;
    private int age;
    private String lesson;

    public Instructor() {
    }

    public Instructor(String name, int age, String lesson) {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "\n name:" + name + "\n age:" + age + "\n lesson:" + lesson;
    }
}
