package org.example;

import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your age");

        int userAge = myObj.nextInt();  // Read user input

        int ageSolution = (100-userAge);

        System.out.println("It will be " + ageSolution + " years until you are 100 years old.");  // Output user input
    myObj.close();
    }
}
