package Chapter3HW.Exercise2.Exercise3;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written: 3/25, 2024
 *
 * This class – Movement (interface) extended from Flight interface that provides
 */

import Chapter3HW.Exercise2.Flight;

public interface Movement extends Flight {
    void walk();
    void jump();
}
