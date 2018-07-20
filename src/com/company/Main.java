package com.company;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        String userName;
        String greeting;
        String responseFromUser = "";
        String typeOfNumber;

        int max = 90;
        int min = 18;
        int appAgeTimesTwo;
        int userAge;
        int ageDifference;
        int temp;


        LocalTime timeOfDay = LocalTime.now();

        final LocalTime MORNING = LocalTime.of(0,0,0);
        final LocalTime AFTER_NOON = LocalTime.of(12,0,0);
        final LocalTime EVENING = LocalTime.of(16,0,0);
        final LocalTime NIGHT = LocalTime.of(21,0,0);


        System.out.print("What is your name? ");
        userName = input.next();


        if(! timeOfDay.isBefore(MORNING) && timeOfDay.isBefore(AFTER_NOON)){

            greeting = "Good Morning!";

        }
        else  if (! timeOfDay.isBefore(AFTER_NOON) &&  timeOfDay.isBefore(EVENING)){

            greeting = "Good Afternoon!";

        }
        else if (! timeOfDay.isBefore(EVENING) &&  timeOfDay.isBefore(NIGHT)){

            greeting = "Good Evening!";

        }
        else {
            greeting = "Good Night!";
        }

        System.out.println(greeting + " " + userName.substring(0,1).toUpperCase() + userName.substring(1) );



        System.out.print(userName.substring(0,1).toUpperCase() + userName.substring(1) + ", " + "how old are you? \n");
        userAge = input.nextInt();



        Random randomNumber = new Random();


        int appAge = randomNumber.nextInt((90 - 18) + 18 );

        System.out.println(appAge);

        if (appAge > userAge) {

            ageDifference = appAge - userAge;

        }
        else {

            ageDifference = userAge - appAge;

        }





        if (appAge == userAge){

            responseFromUser = "I am " + userAge + " years old,  which is the same age as you.";

        }
        else if (userAge > appAge){

            responseFromUser = "I am " + userAge +  " years old, which is " + ageDifference +  " years older than you.";
        }
        else if(userAge < appAge)
        {

            responseFromUser = "I am " + userAge +  " years old, which is " + ageDifference +  " years younger than you.";
        }

        System.out.println(responseFromUser);

        appAgeTimesTwo = appAge * 2;
        System.out.println("Twice my age would be " + appAgeTimesTwo );

        if (userAge % 2 == 0){

            typeOfNumber = "My age is an Even number!";
        }
        else {

            typeOfNumber = "My age is an Odd number!";

        }

        System.out.println(typeOfNumber);

        System.exit(0);

    }


}
