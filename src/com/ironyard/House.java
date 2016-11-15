package com.ironyard;

/**
 * Created by dlocke on 11/15/16.
 */

public class House {

    //variables
    String streetName;
    int streetNum;
    int squareFeet;
    int bedRooms;
    int bathRooms;

    public String getStreetName(){
        return streetName;
    }

    public void setStreetName(String n){
        streetName = n;
    }

    public int getStreetNum(){
        return  streetNum;
    }

    public void setStreetNum(int x){
        if(isValidNum(x)){
        streetNum = x;
        }
    }

    //method to validate house's street number (greater than 0 and less than 9999)
    public static boolean isValidNum(int streetNum){
        return streetNum > 0 && streetNum < 9999;
    }

    public int getSquareFeet(){
        return squareFeet;
    }

    public void setSquareFeet(int f){
        if(f>0){
        squareFeet = f;
        }
    }

    public int getBedRooms(){
        return bedRooms;
    }

    public void setBedRooms(int b){
        if(b>0){
        bedRooms = b;
        }
    }

    public int getBathRooms(){
        return  bathRooms;
    }

    public void setBathRooms(int z){
        if(z>0){
        bathRooms = z;
        }
    }

}//end House