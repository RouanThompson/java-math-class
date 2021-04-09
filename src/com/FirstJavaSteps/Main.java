package com.FirstJavaSteps;

public class Main {

    public static void main(String[] args) {
        int roundedFloat = Math.round(1.1F);
        // Is overloaded. This round() method takes a float and returns an integer

        int ceiling = (int)Math.ceil(1.1F);
        // Returns the smallest number greater than or equal to the argument as a double
        // The return of ceil is being cast to an int

        int floor = (int)Math.floor(1.1F);
        // Returns the largest number that is less than the or equal to the argument as a double

        int max = Math.max(1, 2);
        // Is overloaded. Returns the largest number of the two arguments

        int min = Math.min(1, 2);
        // Is overloaded. Returns the smallest number of the two arguments

        int random = (int)Math.round(Math.random() * 100);
        // Returns a random floating point number from 0 to 1
        // Multiply by 100 to get a random number from 0 to 100
        // round returns a long so i must explicit cast to return a int
        // This will get rid of the decimal as well.

        int randomAlternative = (int) (Math.random() * 100);
        // Always be mind of order of operations as it applies to methods as well.
        // with () wrapping (Math.random() * 100), then the return of random will be cast first
        // Then it will be multiplied by 100. So if the random number is 0.1 then cast to an int which will be 0
        // Then multiplied by 100 which will always be 0. To avoid this use () to increase the order of precedence.

        System.out.println(roundedFloat);
        System.out.println(ceiling);
        System.out.println(floor);
        System.out.println(max);
        System.out.println(min);
        System.out.println(random);
        System.out.println(randomAlternative);
    }
}
