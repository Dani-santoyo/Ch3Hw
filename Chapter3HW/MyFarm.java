package Chapter3HW;

import java.util.ArrayList;
public class MyFarm {
    /**Class: Intermediate Programming
     * @author Daniel Santoyo
     * @version 1.0
     * Course: ITEC 2150 Fall 2019
     * Written: 3/25, 2024
     * This class – MyFarm (main) contains farmAnimals list that contains duck cows and chicken
     * objects
     */
    public static void main(String[] args){
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        Duck duck = new Duck("Donald", "male", 3.2, 5, "Quack Quack");
        Duck duck1 = new Duck("Cheese", "female", 3.6,5, "Quack Quack");
        Cow cow = new Cow("Molly", "female", 16000.0, 3, "Moo Moo");
        Chicken chicken = new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo");
        Chicken chicken1 = new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck");
        Chicken chicken2 = new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck");

        farmAnimals.add(duck);
        farmAnimals.add(duck1);
        farmAnimals.add(cow);
        farmAnimals.add(chicken);
        farmAnimals.add(chicken1);
        farmAnimals.add(chicken2);
        System.out.println(farmAnimals);
        System.out.println(duck.feedLoadingSchedule());
        System.out.println(duck1.feedLoadingSchedule());
        System.out.println(cow.feedLoadingSchedule());
        System.out.println(chicken.feedLoadingSchedule());
        System.out.println(chicken1.feedLoadingSchedule());
        System.out.println(chicken2.feedLoadingSchedule());
    }
}
