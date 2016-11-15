package com.ironyard;

public class Main {

    public static void main(String[] args) {
        Burrito x = new Burrito();
        x.meat = "steak";
        x.name = "El";
        System.out.println(x.getName() + " " + x.getMeat());

        Car y = new Car();
        y.isRunning = true;
        System.out.println(y.isRunning());

        Dog d = new Dog();
        d.breed = "pointer";
        System.out.println(d.getBreed());

        House h = new House();
        h.bedRooms = 2;
        System.out.println(h.getBedRooms());

        Superhero s = new Superhero();
        s.power = "flying";
        System.out.println(s.getPower());

    }
} //end Main
