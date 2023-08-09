import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner console= new Scanner(System.in);

        Cab cab;

        System.out.println("\nPlease choose your Cab Booking App: OLA / UBER\n");
        String app= console.nextLine();

        if(app.equalsIgnoreCase("OLA"))
        {
            cab= new OLA();
            System.out.println("\n");
            cab.template(console);
        }
        else if(app.equalsIgnoreCase("UBER"))
        {
            cab= new Uber();
            System.out.println("\n");
            cab.template(console);
        }
        else 
            System.out.println("Invalid Choice");

    }
}