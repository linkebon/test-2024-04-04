package com.example.test;

public class TestApplication {
    public static void main(String[] args) {
        // Part 1.
        // 1. Loop through the numbers array
        // 2. Increase each number by 1
        // 3. Filter even numbers
        // 4. Sum the numbers
        // 5. Print the result
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // Part 2.
        // Expose GET endpoint /numbers/sum which takes a comma separated list of numbers in the query parameter named numbers
        // [GET] /numbers/sum?numbers=1,2,3,4,5,6,7,8,9
        // The endpoint should return the sum of the numbers according to the algorithm in Part 1 as json
        /*
        Example: /numbers/sum?numbers=1,2,3,4,5,6,7,8,9
        {
            "sum": 30
        }
        */

        // Part 3.
        // Create a test for the endpoint api /numbers/sum that uses the api, and asserts the result
    }

}
