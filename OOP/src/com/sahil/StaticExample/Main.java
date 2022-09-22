package com.sahil.StaticExample;
// Reason behind, we use "Static" keyword with SamePkg function (public static void SamePkg)
    // static is a class level variable, means it is not dependent on the instance or object.
    // Similarly, when a method is static it can be invoked without creating the instance of the class
    // suppose if the main function is not static, then we need an instance to run this main function
    // But we know this main function is the first thing which is going to run
    // That's the reason we declare main function as a static, because it will be invoked without creating
    // the instance

public class Main {
    public static void main(String[] args) {
        // you can accesss static variable without intializing objects
        // because it is not dependant on objects
        System.out.println(Cars.noOfCarsInShowroom);

        Cars iTen = new Cars(6,"White",220);
        Cars iTwenty = new Cars(12,"Black",250);
        // we know the number of cars in a specific showroom will be same for every car(object) this no. of
        // cars is not dependent on the properties of cars
        // in such situation we declare no.of cars variable as static bcos this property will be same for every car


        // you can accesss static variable by an object by this is not right way to do it
        System.out.println(iTen.noOfCarsInShowroom);
        System.out.println(iTwenty.noOfCarsInShowroom);
        // Instead you should be accessing static varible by its ClassName, like this
        System.out.println(Cars.noOfCarsInShowroom);
        System.out.println(Cars.noOfCarsInShowroom);


        /// Without static ,it will be specific to a car
        System.out.println(iTen.noOfCarsInShowroomWithoutStatic);
        System.out.println(iTwenty.noOfCarsInShowroomWithoutStatic);



//        fun();  // Here you can not use this fun because it is non-static
                // (it needs to have an object to initialize)
                // and you are trying to initialize inside static method
                // which doesn't need any object to initialize

        // if you want to run this fun inside static method you should make it static, or
        // you should initialize an instance for this fun()

        Main obj = new Main();
        obj.fun();


    }
        public void fun(){
            System.out.println("I am non-static fun");
        }

}
