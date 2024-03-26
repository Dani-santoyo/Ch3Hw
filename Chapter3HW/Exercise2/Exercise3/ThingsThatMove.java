package Chapter3HW.Exercise2.Exercise3;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written: 3/25, 2024
 *
 * This class – ThingsThatMove (main) creates airplane and bird objects and calls fly
 * and walk methods
 */

import Chapter3HW.Exercise2.Airplane;
import Chapter3HW.Exercise2.Bird;

public class ThingsThatMove {
    public static void main(String[] args){
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird bird = new Bird("Eagle");
        Bird bird1 = new Bird("Hummingbird");

        airplane.toString();
        airplane.fly();
        airplane.walk();
        airplane.jump();

        bird.toString();
        bird.fly();
        bird.walk();
        bird.jump();

        bird1.toString();
        bird.fly();
        bird.walk();
        bird.jump();
    }
}
