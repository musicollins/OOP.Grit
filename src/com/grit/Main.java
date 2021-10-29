package com.grit;


import java.util.ArrayList;

import static java.lang.System.out;

class Flight{
    //Constructor
    public Flight(String n, String pilotN){
        name = n;
        pilotName = pilotN;
    }
    //State
    private String name;
    private int speed;
    private String pilotName;
    //Behaviour
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int s){
        if(s < 0){
            out.println("SPEED CANNOT BE LESS THAN 0");
        }else{
            speed = s;
        }

    }
    public void setName(String newName){
        name = newName;
    }
    public String getPilotName() {
        return pilotName;
    }
}

public class Main {
    public static void main(String[] args) {
	// OOP Fundamentals
        Flight f1 = new Flight("B3 777", "John Smith");
        Flight f2 = new Flight("C5 555", "Neo Cortex");
        out.println("Flight Name is: " + f1.getName() + " Pilot name is " + f1.getPilotName());
        out.println("Flight Name is: " + f2.getName() + " Pilot name is " + f2.getPilotName());

        ArrayList<Flight> flights = new ArrayList<Flight>();
        flights.add(f1);
        flights.add(f2);

        for (var flight:flights){
            out.println(flight.getName());
        }





    }
}
