package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double hour = 9;
        double minutes = 32;
        double seconds = 30;

        double hour_since = 10;
        double minutes_since = 26;
        double seconds_since = 11;
        
        double seconds_in_a_day = 86400;
        double seconds_since_midnight = (hour*3600.0)+(minutes*60.0)+seconds;

        double percentage_of_the_day_passed = ((seconds_since_midnight/seconds_in_a_day));

        double seconds_since_exercise_start = ((hour_since*3600.0)+minutes_since*60.0)+seconds_since;
        double time_difference = (seconds_since_exercise_start-seconds_since_midnight);

        System.out.println("Seconds from midnight: "+seconds_since_midnight);
        System.out.println("Seconds left in the day: "+(seconds_in_a_day-seconds_since_midnight));
        System.out.println("Percentage of the day that has passed: "+percentage_of_the_day_passed*100.0+"%");
        System.out.println("Time since I started the exercise: "+time_difference);


    }
}
