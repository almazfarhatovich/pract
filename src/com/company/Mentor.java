package com.company;

public class Mentor {
    private String name;
    private int age;
    private String lesson;
    private String dayOrNight;

    public Mentor() {
    }

    public Mentor(String name, int age, String lesson, String dayOrNight) {
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

    public String getDayOrNight() {
        return dayOrNight;
    }

    public void setDayOrNight(String dayOrNight) {
        this.dayOrNight = dayOrNight;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "\n name:" + name + "\n age:" + age + "\n lesson:" + lesson + "\n Day or Evening shift:" + dayOrNight;
    }
}

