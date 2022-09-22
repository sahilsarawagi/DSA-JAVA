package com.sahil.generics.Compare;

public class Student implements Comparable<Student> {
    int rollno;
    float powerLevel;

    public Student(int rollno, float powerLevel) {
        this.rollno = rollno;
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return powerLevel+ " " ;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.powerLevel -  o.powerLevel);
        return diff;
    }
}
