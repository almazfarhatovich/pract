package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Group group = new Group("Java","04/01/22",12000);
        Group group1 = new Group("JavaScript","05/01/22",12000);
        Group[] groups = {group,group1};

        Student student = new Student("Ulan",26,"Java","Day group");
        Student student1 = new Student("Adilet",17,"Java","Evening group");
        Student student2 = new Student("Темирлан",25,"JavaScript","Day group");
        Student[]students = {student,student1,student2};

        Instructor instructor = new Instructor("Mukhamad",25,"Java 1");
        Instructor instructor1 = new Instructor("Zamir",28,"Java 2");
        Instructor instructor2 = new Instructor("Nargiza",22,"JavaScript");
        Instructor[]instructors = {instructor, instructor1, instructor2};

        Mentor mentor = new Mentor("Aizhan",22,"Java 1","Day group");
        Mentor mentor1 = new Mentor("Beksultan",18,"Java 1","Evening group");
        Mentor[]mentors = {mentor,mentor1};

        System.out.println("Peaksoft House consist:");
        Peaksoft peaksoft = new Peaksoft(groups,students,instructors,mentors);
        System.out.println(peaksoft);
    }
}
