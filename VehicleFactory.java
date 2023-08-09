public class VehicleFactory implements Factory{
    public Vehicle selectVehicle(String VehicleType){
        if(VehicleType.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        else if(VehicleType.equalsIgnoreCase("Auto")){
            return new Auto();
        }
        else if(VehicleType.equalsIgnoreCase("Mini Car")){
            return new MiniCar();
        }
        else if(VehicleType.equalsIgnoreCase("Prime Car")){
            return new PrimeCar();
        }
        else 
          return null;
    }

}