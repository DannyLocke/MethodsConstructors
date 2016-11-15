package com.ironyard;

/**
 * Created by dlocke on 11/15/16.
 */

public class Burrito {

    //variables
    String name;
    String prename;
    String meat;
    String cheese;
    int quantity;
    boolean hasSalsa;


    public String getName(){
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getHasSalsa() {
        return hasSalsa;
    }

    public void setPreName(String p){
        prename = p;
    }

    public void setName(String n){
        name = n;
    }

    public void setMeat(String m) {
        meat = m;
    }

    public void setCheese(String c) {
        cheese = c;
    }

    public void setQuantity(int q) {
        if(isValidOrder(quantity)){
        quantity = q;
        }
    }

    //method to keep order between 1 and 50 burritos
    public static boolean isValidOrder(int quantity){
        return quantity >= 1 && quantity <= 50;
    }

    public void setHasSalsa(boolean s) {
        hasSalsa = s;
    }
}//end Burrito