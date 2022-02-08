package com.company;

public class Student {
    private String name;
    private int age;
    private String lesson;
    private String dayOrNight;

    public Student() {
    }

    public Student(String name, int age, String lesson, String dayOrNight) {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
        this.dayOrNight = dayOrNight;
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

    public String getDayOrNight() {
        return dayOrNight;
    }

    public void setDayOrNight(String dayOrNight) {
        this.dayOrNight = dayOrNight;
    }

    @Override
    public String toString() {
        return "\n name:" + name + "\n Age:" + age + "\n IT Language:" + lesson + "\n Day or Evening group:" + dayOrNight;
    }
}
