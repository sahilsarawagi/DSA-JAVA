package com.sahil.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=7,b=0;

        // See we can run multiple catch, but it will act like the (if ladder) means if the first one executated then the
        // other which are below the executed one, will not execute
        // so As we know  Exception class is the parent of all other exception classes
        // if we are putting Exception class above all the exception in catch statement
        // then other catch will have no use

        try{
            divide(a,b);
            String name = "Sasuke";
            if (name.equals("Sasuke")){
                throw new MyException("name is Sasuke");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will execute even if there are exceptions");
        }

    }

    // We the function is handling exception, then we should also instruct function during declaring.
    // like as in divide function  (throws ArthimeticException)
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("please do no divide by zero");
        }

        return  a / b;
    }
}
