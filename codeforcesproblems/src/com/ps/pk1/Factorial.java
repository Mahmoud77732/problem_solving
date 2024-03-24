package com.ps.pk1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        /*
        factorial of any number will be "even" except 1 is odd
        */
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        checkFactorialEvenOrOdd(num);

    }

    public static void checkFactorialEvenOrOdd(long num){
        if(num < 2){
            System.out.println("NO"); // odd
        }
        else{
            System.out.println("YES"); // even
        }
    }

    public static int getFactorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * getFactorial(num-1);
        }
    }

}
