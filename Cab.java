import java.util.*;

public abstract class Cab{

    int flag;

    Cab(){
        flag=0;
    }
    
    //hook method
    public void initialize(){
        System.out.println("Hello !");
    }

    public void chooseRide(Scanner console){
        System.out.println("\nChoose your ride: Bike/ Auto/ Mini Car/ Prime Car");
        String ride= console.nextLine();
        VehicleFactory vF= new VehicleFactory();
        Vehicle v= vF.selectVehicle(ride);
        v.getFare();
    }

    public void verifyOTP(Scanner console){
        System.out.println("\nEnter the 6-digit OTP for your ride");
        String otp= console.nextLine();
        Verify proxy= new VerifyProxy();
        proxy.verify(this,otp);
    }

    public void payment(Scanner console){
        System.out.println("\nChoose your payment method: Cash / UPI");
        String pay= console.nextLine();
        if(pay.equalsIgnoreCase("Cash"))
        {
            System.out.println("Please pay at the completion of your ride to the driver.\n");
        }
        else if(pay.equalsIgnoreCase("UPI"))
        {
            System.out.println("Please scan the QR code available in your ride.\n");
        }
        else 
            System.out.println("Invalid Choice");
     }

    //primitive methods
    public abstract void startRide();
    public abstract void completeRide();
    
    //template method
    public void template(Scanner console){

        initialize();

        chooseRide(console);

        payment(console);

        verifyOTP(console);

        if(flag==1)
        {
            startRide();

            completeRide();
        }

        else
            System.out.println("\nWrong OTP! Ride Cacelled.\n");
        
    } 
}