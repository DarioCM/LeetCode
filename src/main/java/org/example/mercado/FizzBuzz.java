package org.example.mercado;

public class FizzBuzz {

    /*
    Write a short program that prints each number from 1 to 100 on a new line.
    For each multiple of 3, print "Fizz" instead of the number.
    For each multiple of 5, print "Buzz" instead of the number.
    For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
    */

    public static void main(String[] args) {

        var n = 1;
        do {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        } while (n++ < 15);


    }
}
