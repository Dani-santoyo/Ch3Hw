package Chapter3HW.Exercise2;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written: 3/25, 2024
 *
 * This class – Airplane (object) Provides constructors, getter, setter, toString
 * fly, walk and jump methods
 */

import Chapter3HW.Exercise2.Exercise3.Movement;

public class Airplane implements Flight, Movement {
    private String model;
    private int year;

    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void fly(){
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }
    public void walk(){
        System.out.println("I tax on my wheels");
    }
    public void jump(){
        System.out.println("I cannot jump");
    }
    public String toString(){
        return "[model=" + model + ", year=" + year + "]: ";
    }
}
