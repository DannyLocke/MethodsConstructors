package com.ironyard;

/**
 * Created by dlocke on 11/15/16.
 */

public class Dog {

    //variables
    String breed;
    int age;
    int weight;
    boolean isAlive;

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public void setAge(int a) {
        if(validAge(a)){
        age = a;
        }
    }

    //method to ensure age is above 0 and below 50
    public static boolean validAge(int age){
        return age > 0 && age < 50;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


}//end Dog