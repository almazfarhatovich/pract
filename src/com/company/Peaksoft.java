package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Peaksoft {
    private Group[] groups;
    private Student[] students;
    private Instructor[] instructors;
    private Mentor[] mentors;

    public Peaksoft() {
    }

    public Peaksoft(Group[] groups, Student[] students, Instructor[] instructors, Mentor[] mentors) {
        this.groups = groups;
        this.students = students;
        this.instructors = instructors;
        this.mentors = mentors;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    @Override
    public String toString() {
        return "Groups info:" + Arrays.toString(groups) + "\n" +
                "Students info:" + Arrays.toString(students) + "\n" +
                "Intructors info:" + Arrays.toString(instructors) + "\n" +
                "Mentors info:" + Arrays.toString(mentors);
    }
}
