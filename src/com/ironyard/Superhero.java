package com.ironyard;

/**
 * Created by dlocke on 11/15/16.
 */

public class Superhero {

    //variables
    String name;
    String power;
    int height;
    int weight;

    public String getName(){
        return name;
    }
    public void setName(String n){
        if(isValidName(n)){
            name = n;
        }
    }

    //method to ensure a name is entered and is less that 30 characters long
    public static boolean isValidName (String name){
        return !name.isEmpty() && name.length() <= 30;
    }

    public String getPower(){
        return power;
    }
    public void setPower(String p){
        power = p;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        if(h>0){
        height = h;
        }
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int w){
        if(w>0){
        weight = w;
        }
    }
}//end Superhero
