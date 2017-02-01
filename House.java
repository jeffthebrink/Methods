
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This House class defines and delineates types of houses from one another
 */
public class House {
    String resType; //this data represents apartment, detached house, condominium, etc...
    boolean hasFireplace;
    double numberOfBathrooms;
    int numberOfBedrooms;
    int yearsLeftOnMortgage;
    double [] myMonthlyCost; //this was a practice at making arrays, it's use here is monthly cost

    //constructor
    public House(String resType, boolean hasFireplace, double numberOfBathrooms, int numberOfBedrooms, int yearsLeftOnMortgage, double[] myMonthlyCost) {
        this.resType = resType;
        this.hasFireplace = hasFireplace;
        setNumberOfBathrooms(numberOfBathrooms);
        setNumberOfBedrooms(numberOfBedrooms);
        this.yearsLeftOnMortgage = yearsLeftOnMortgage;
        this.myMonthlyCost = myMonthlyCost;
    }

    //getter setter

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public boolean isHasFireplace() {
        return hasFireplace;
    }

    public void setHasFireplace(boolean hasFireplace) {
        this.hasFireplace = hasFireplace;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    //conditional
    public void setNumberOfBathrooms(double numberOfBathrooms) {
        if (numberOfBathrooms > 4) {
        this.numberOfBathrooms = numberOfBathrooms;
        System.out.println("Your home has a lot of bathrooms!");}
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    //conditional
    public void setNumberOfBedrooms(int numberOfBedrooms) {
        if ( (numberOfBedrooms <= 4) && (numberOfBedrooms >= 0) ){
        this.numberOfBedrooms = numberOfBedrooms;}
        else {System.out.println("Your home has a lot of bedrooms!");}
    }

    public int getYearsLeftOnMortgage() {
        return yearsLeftOnMortgage;
    }

    public void setYearsLeftOnMortgage(int yearsLeftOnMortgage) {
        this.yearsLeftOnMortgage = yearsLeftOnMortgage;
    }

    public double[] getMyMonthlyCost() {
        return myMonthlyCost;
    }

    public void setMyMonthlyCost(double[] myMonthlyCost) {
        this.myMonthlyCost = myMonthlyCost;
    }

    public static void main(String[] args) {

        double[] myMonthlyCost = new double[4];
        House nashvilleHouse = new House("Condo", false, 5, 5, 15, myMonthlyCost);




        System.out.println("Your housing type is: " + nashvilleHouse.getResType());
    }
}
