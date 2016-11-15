package com.ironyard;

/**
 * Created by dlocke on 11/15/16.
 */

public class Car {

    //variables
    String make;
    String model;
    int year;
    boolean isRunning;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setMake(String m) {
        if(validMake(m)){
        make = m;
        }
    }

    //method to ensure a make is entered and is less than 25 characters long
    public static boolean validMake(String make){
        return !make.isEmpty() && make.length() <=25;
    }

    public void setModel(String x) {
        if(validModel(x)){
        model = x;
        }
    }

    //method to ensure a model is entered and is less than 25 characters long
    public static boolean validModel(String model){
        return !model.isEmpty() && model.length() <= 25;
    }

    public void setYear(int yr) {
        if(yr>1900){
        year = yr;
        }
    }

    public void setRunning(boolean run) {
        isRunning = run;
    }


}//end Car