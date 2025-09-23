package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Step 1 - Write code to find answers to the following questions
        // Question 1 - Salary Comparison
        int bobSalary = 50000;
        int garySalary = 60000;
        int highestSalary;
        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("Question 1:");
        System.out.println("The highest salary is $" + highestSalary);
        System.out.println();

        // Question 2 - Display the smaller price
        double carPrice = 24999;
        double truckPrice = 54999;
        double lowestCost;
        lowestCost = Math.min(carPrice, truckPrice);
        System.out.println("Question 2:");
        System.out.println("The cheapest cost between the two is $" + lowestCost);
        System.out.println();

        // Question 3 - Display the area of a circle w/ a radius of 7.25
        double radius = 7.25;
        double area;
        area = Math.PI * (radius * radius);
        System.out.println("Question 3:");
        System.out.println("The area of a circle with a radius of " + radius + " is: " + Math.round(area));
        System.out.println();

        // Question 4 - Find and Display the square root of a variable after it is set to 5.0
        double number = 5;
        System.out.println("Question 4:");
        System.out.println("The square root of " + number + " is: " + Math.sqrt(number));
        System.out.println();

        // Question 5 - Find the distance between the points (5, 10) & (85, 50)
        int pointX1 = 5;
        int pointX2 = 85;
        int pointY1 = 10;
        int pointY2 = 50;



    }
}
