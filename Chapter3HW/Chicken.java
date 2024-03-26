package Chapter3HW;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written: 3/25, 2024
 * This class – Chicken (farm animal) extends FarmAnimal
 * Provides constructors, getter, setter, toString
 * and feedLoadingSchedule methods
 */

public class Chicken extends FarmAnimal {
    private String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString(){
        return "Chicken " + sound + " [name=" + this.getName()+ ", gender=" + this.getGender()
                + ", weight=" + this.getWeight() + ", age=" + this.getAge()
                + "]";
    }

    @Override
    String feedLoadingSchedule() {
        return this.getName() + ": 8am-4pm";
    }
}
