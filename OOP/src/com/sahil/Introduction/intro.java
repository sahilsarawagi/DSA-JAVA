package com.sahil.Introduction;

public class intro {
    public static void main(String[] args) {
        Student Sahil = new Student();
        System.out.println(Sahil.rno);
        System.out.println(Sahil.name);
        Student sakura =new Student();
        System.out.println(sakura.name +"  "+ sakura.rno);
        Student random = new Student(Sahil);
        System.out.println(random.name);

        Student one = new Student();
        Student two =one;
        one.name = "Billu";
        System.out.println(two.name);

    }
    static class Student {
        String name;
        int rno;
        Student(){
//            this.name = "Sasuke";
//            this.rno = 8;

            // internally it is something like Student(int rno , String name);
            this( 18  , "Naruto");
        }
        Student(Student other){
            this.name = other.name;    // this will act as a random.name = Sahil.name

            // this is how u call a constructor from another constructor

        }
        Student(int rno, String name){
            this.rno = rno;
            this.name = name;
        }
    }
}

