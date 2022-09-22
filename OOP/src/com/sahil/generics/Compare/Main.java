package com.sahil.generics.Compare;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Ino = new Student(5 , 100f);
        Student Tsunade = new Student(10 , 106f);
        Student Sakura = new Student(0 , 30f);
        Student Hinata = new Student(45 , 102f);


        if(Tsunade.compareTo(Sakura)>0){
            System.out.println("Sakura");
        }


        Student[] list = {Ino,Tsunade,Sakura,Hinata};
        System.out.println(Arrays.toString(list));


        // the question is that if the Student has two parameter roll and powerlevel then how it is sorting based on powerlevel
        // Reason is that, it is using compareTo method, which we have overridden
        // if we remove this compare to then it will give us an error

//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));

        // We can also override this compareTo directly on this Array.sort, like this
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student student, Student t1) {
//                return 0;
//            }
//        });

//        Instead of using this we can also use lambda method
        Arrays.sort(list, (o1, o2) -> -(int)(o1.powerLevel - o2.powerLevel));




    }

}
