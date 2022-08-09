package com.company;

public class TypeCasting {
    public static void main(String[] args) {
        // typecasting
        int num =(int)(45.56f);
        System.out.println(num);

        // Automatic type promotion in expression
        int a =257;
        byte b=  (byte)(a);  // we know byte size is 256, and we are providing expliticilty value more than of size byte
        System.out.println(b); // result will be 257%256=1

        //--------------------------------------//
        byte p=40;
        byte q=50;
        byte r=100;
        int z= p*q/r;
        System.out.println(z); // here we didn't get the error, as p is byte and q is byte and there multiplication will be 2000 which will be more than range of byte
                                // so in java, when doing multiplication of byte, it will promote the resultant of multiplication to int
                                // if we try to assign p*q to any byte type, it will give an error bcos we are trying to assign int to byte
        byte m= 2;
     //   byte k= m*2;  // see this line is giving error even though 2*2=4 is in range of byte but java promoted this m*2 to int
                        // and we cant assign bigger data type to smaller data type

        //-------------------------//
        int number= 'B';
        System.out.println(number);

        // RULES FOR THE
        // 1. All the byte, short and  char values are promoted to integer
        // 2. If any one of the operand is long,double,float the whole promotion will be promoted to long,double,float respectively
//---------------------------------------------------------------//
        byte buyte=42;
        char charac='a';
        short shot= 1024;
        int intger=50000;
        float flute=5.67f;
        double duble=0.1234;
        double result =(flute*buyte) + (intger/charac)+(duble*shot);   // // float + int - double
        System.out.println((flute*buyte)+ "  " + (intger/charac)+ "  "+(duble*shot));
        System.out.println(result);   //// float + int - double =double
    }
}
