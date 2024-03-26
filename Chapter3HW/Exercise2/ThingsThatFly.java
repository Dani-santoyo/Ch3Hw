package Chapter3HW.Exercise2;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written: 3/25, 2024
 * This class – ThingsThatFly (main) creates airplane and bird objects as well as
 * thingsthatfly array list that contains objects created
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThingsThatFly{
    public static void main(String[] args){
        ArrayList<Object> thingsThatFly = new ArrayList<>();

        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird bird = new Bird("Eagle");
        Bird bird1 = new Bird("Hummingbird");

        thingsThatFly.add(airplane);
        thingsThatFly.add(bird);
        thingsThatFly.add(bird1);

        for(int i = 0; i < thingsThatFly.size(); i++){
            System.out.print(thingsThatFly.get(i));
            if(thingsThatFly.get(i).equals(airplane)){
                airplane.fly();
            }else{
                bird.fly();
            }

        }
    }
}
