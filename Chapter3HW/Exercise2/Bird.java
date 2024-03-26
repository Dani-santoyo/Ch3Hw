package Chapter3HW.Exercise2;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written: 3/25, 2024
 *
 * This class – Bird (object) Provides constructors, getter, setter, toString
 * fly, walk and jump methods
 */

import Chapter3HW.Exercise2.Exercise3.Movement;

public class Bird implements Flight, Movement {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps wings to fly.");
    }
    public void walk(){
        System.out.println("I walk on my feet");
    }
    public void jump(){
        System.out.println("I jump by leaping from my feet");
    }
    @Override
    public String toString(){
        return "[type=" + type + "]";
    }
}
