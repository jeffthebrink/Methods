
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This represents information about a sport
 */
public class Sport {
    String name;
    int numberOfPlayers;
    boolean usesBall;
    int[] myStats;

    //constructor
    public Sport(String name, int numberOfPlayers, boolean usesBall, int[] myStats) {
        this.name = name;
        setNumberOfPlayers(numberOfPlayers);
        this.usesBall = usesBall;
        this.myStats = myStats;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {

        return numberOfPlayers;

    }

    //conditional
    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers > 4) {
            this.numberOfPlayers = numberOfPlayers;
        } else {
            System.out.println("There are not enough players on your team!");
        }

    }

    public boolean isUsesBall() {
        return usesBall;
    }

    public void setUsesBall(boolean usesBall) {
        this.usesBall = usesBall;
    }

    public int[] getMyStats() {
        return myStats;
    }

    public void setMyStats(int[] myStats) {
        this.myStats = myStats;
    }

    public static void main(String[] args) {

        int[] myStats = new int[7];
        myStats[1] = 10;
        myStats[2] = 8;
        myStats[3] = 5;
        myStats[4] = 15;
        myStats[5] = 1;

        Sport mySport = new Sport("Basketball", 2, true, myStats);

        System.out.println("The name of your sport is: " + mySport.getName());
        System.out.println("The number of players is: " + mySport.getNumberOfPlayers());
        System.out.println("The status of Basketball using a ball is: " + mySport.isUsesBall());
        System.out.println("The stats for the Basketball game are: " + mySport.myStats[1]);
    }
}

