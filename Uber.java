public class Uber extends Cab{

    public void initialize(){
        super.initialize();
        System.out.println("Welcome to UBER.");
    }

    public void startRide(){
        System.out.println("\nStarted. Enjoy your ride with us!");
    }

     public void completeRide(){
        System.out.println("\nEnded. Hope to see you again!");
     }

}