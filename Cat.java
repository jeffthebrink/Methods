
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This Cats class defines attributes of cats like their name, breed, hair length, etc...
 */
public class Cat {
    String name;
    String breed;
    boolean longHair;
    int age;
    boolean neutered;
    boolean spayed;

    //constructor
    public Cat(String name, String breed, boolean longHair, int age, boolean neutered, boolean spayed) {
        setName(name);
        this.breed = breed;
        this.longHair = longHair;
        this.age = age;
        this.neutered = neutered;
        this.spayed = spayed;
    }

    //getter setter

    public String getName() {
        return name;
    }

    //conditional
    public void setName(String name) {
        if (name != null){
        this.name = name;
        System.out.println("Congratulations! You have a cat!");}
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isLongHair() {
        return longHair;
    }

    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isSpayed() {
        return spayed;
    }

    public void setSpayed(boolean spayed) {
        this.spayed = spayed;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", "Callico", false, 4, false, true);


        System.out.println("Your cat's name is: " + myCat.getName());
        System.out.println(myCat.getName() + "'s age is " + myCat.getAge());
        System.out.println(myCat.getName() + "'s spayed status is " + myCat.isSpayed());

    }


}
