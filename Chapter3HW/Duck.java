package Chapter3HW;

public class Duck extends FarmAnimal {
    private String sound;
    /**Class: Intermediate Programming
     * @author Daniel Santoyo
     * @version 1.0
     * Course: ITEC 2150 Fall 2019
     * Written: 3/25, 2024
     * This class – Duck (farm animal) extends FarmAnimal
     * Provides constructors, getter, setter, toString
     * and feedLoadingSchedule methods
     */

    public Duck(String name, String gender, double weight, int age, String sound) {
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
        return "Duck " + sound + " [name=" + this.getName()+ ", gender=" + this.getGender()
                + ", weight=" + this.getWeight() + ", age=" + this.getAge()
                + "]";
    }

    @Override
    String feedLoadingSchedule(){
        return this.getName() + ": 8am-12pm-6pm";
    }
}
