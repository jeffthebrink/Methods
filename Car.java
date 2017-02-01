
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This Cars class defines what fields (make, odometer, year built, etc...) are available to select for a given car
 */
public class Car {
    String name;
    boolean isTruck;
    int numberOfDoors;
    double odometer;
    int yearBuilt;
    String[] availableMakes; //available makes like Ford, GM, Chevrolet, Pontiac, Nissan, etc...

    //constructor
    public Car(String name, boolean isTruck, int numberOfDoors, double odometer, int yearBuilt, String[] availableMakes) {
        this.name = name;
        setTruck(isTruck);
        this.numberOfDoors = numberOfDoors;
        this.odometer = odometer;
        this.yearBuilt = yearBuilt;
        this.availableMakes = availableMakes;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTruck() {
        return isTruck;
    }

    //conditional
    public void setTruck(boolean truck) {
        if (truck == true) {
            System.out.println("Your vehicle is a truck!");
        }
        isTruck = truck;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String[] getAvailableMakes() {
        return availableMakes;
    }

    public void setAvailableMakes(String[] availableMakes) {
        this.availableMakes = availableMakes;
    }

    public static void main(String[] args) {
        String[] availableMakes = new String[20];

        Car jeffsCar = new Car("F150", true, 2, 75000.6, 2012, availableMakes); //object created according to constructor


        System.out.println("Your vehicle is an " + jeffsCar.getName());
        System.out.println("Your vehicle was built in " + jeffsCar.getYearBuilt());
        System.out.println("There are " + jeffsCar.getOdometer() + " miles on your vehicle.");
    }


}
