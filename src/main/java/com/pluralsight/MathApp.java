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
        System.out.println("Bob's salary is $" + bobSalary);
        System.out.println("Gary's salary is $" + garySalary);
        System.out.println("The highest salary between the two is $" + highestSalary);
        System.out.println();

        // Question 2 - Display the smaller price
        double carPrice = 24999;
        double truckPrice = 54999;
        double lowestCost;
        lowestCost = Math.min(carPrice, truckPrice);
        System.out.println("Question 2:");
        System.out.println("The price of a car is: $" + carPrice);
        System.out.println("The price of a truck is: $" + truckPrice);
        System.out.println("The cheapest cost between the two is $" + lowestCost);
        System.out.println();

        // Question 3 - Display the area of a circle w/ a radius of 7.25
        double radius = 7.25;
        double area;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Question 3:");
        System.out.println("The area of a circle with a radius of " + radius + " is: " + Math.round(area));
        System.out.println();

        // Question 4 - Find and Display the square root of a variable after it is set to 5.0
        double number = 5;
        System.out.println("Question 4:");
        System.out.println("The square root of " + number + " is: " + Math.sqrt(number));
        System.out.println();

        // Question 5 - Find the distance between the points (5, 10) & (85, 50)
        double pointX1 = 5;
        int pointX2 = 85;
        int pointY1 = 10;
        int pointY2 = 50;

        System.out.println("Question 5:");
        double differenceX = pointX2 - pointX1;
        System.out.println("The difference between the X coordinates is: " + differenceX);
        int differenceY = pointY2 - pointY1;
        System.out.println("The difference between the Y coordinates is: " + differenceY);

        double totalSum = Math.pow(differenceX, 2) + Math.pow(differenceY, 2);
        System.out.println("The sum of these two differences squared is: " + totalSum);

        double finalValue = Math.sqrt(totalSum);
        System.out.println("The distance between the two values is: " + Math.round(finalValue));
        System.out.println();

        // Question 6 - display the absolute value of a variable after it is set to -3.8
        pointX1 = -3.8;
        System.out.println("Question 6:");
        System.out.println("The first X coordinate from question 5 is now: " + pointX1);
        System.out.println("The absolute value of -3.8 is " + Math.abs(pointX1));
        System.out.println();

        // Question 7 - find and display a random number between 0 and 1
        System.out.println("Question 7:");
        System.out.println("Printing a random number between 0 and 1...");
        System.out.println("Generated: " + Math.random());
        System.out.println();

        // Question 8 - Calculate how many minutes are in 24 days | Bonus - calculate the amount of milliseconds
        int totalDays = 24;
        int totalHours;
        int totalMinutes;
        int totalSeconds;
        int totalMilliSeconds;
        System.out.println("Question 8:");
        System.out.println("If you want to know how many minutes are in " + totalDays + " days, I'll tell you!");
        totalHours = totalDays * 24;
        System.out.println("First you need to find the amount of hours in " + totalDays + " days by multiplying the days by 60. This equals " + totalHours + " hours.");
        totalMinutes = totalHours * 60;
        System.out.println("Next you need to get the total amount of minutes from " + totalHours + " by multiplying that number by 60. You should get " + totalMinutes + " minutes.");
        totalSeconds = totalMinutes * 60;
        totalMilliSeconds = totalSeconds * 1000;
        System.out.println("Then you get the total amount of seconds by multiplying the total number of minutes by 60 again. That number is " + totalSeconds + " seconds.");
        System.out.println("Finally, you can get the amount of milliseconds by multiplying the amount of seconds by 1,000. That number is " + totalMilliSeconds + " milliseconds.");
        System.out.println();

    }
}
