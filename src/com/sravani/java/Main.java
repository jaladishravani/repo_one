package com.sravani.java;

public class Main {

    // a = 10, b = 5
    // Sum of a, b is 15
    // Difference of a, b is 5
    // Multiplication of a, b is 50
    // Division of a,b is 2
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(" a = " +a+", b = "+b );

        int result;
        // addition
        result = add(a, b);
        System.out.println("Sum of a,b is " + result);


        //Difference
        result = difference(a,b);
        System.out.println("Difference of a,b is " + result);

        // multiply
        // System.out.println("Multiplication");
        result = multiply(a,b);

        System.out.println("Multiplication of a, b is " + result);



        // System.out.println("Division Java");


        // int a = , b= o, result;
        float answer;

        answer = division(a,b);

        System.out.println("Division of a,b is " + answer);











    }

    private static int add(int x, int y) {
        int result;
        result = x + y;

        return result;
    }

    private static int difference(int x, int y) {
        int result;
        result = x - y;

        return result;
    }

    private static int multiply(int x, int y) {
        int result;
        result = x * y;

        return result;
    }


    private static float division(float a, float b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        float answer;

         answer = a/b ;
        //System.out.println("answer " +answer);

         return answer;


    }

//private static int add(int );
















}