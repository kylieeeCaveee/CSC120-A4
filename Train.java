import java.util.ArrayList; 
public class Train implements TrainRequirements
{
    private ArrayList<Car> carList; 
    private FuelType f; 
    private double fuelCapacity; 
    private int nCars; 
    private int passengerCapacity; 
    private Engine engine; 

    /**
     * This is the constructor for the Train Class.
     * @param f- the fuel type attribute
     * @param fuelCapacity- how much fuel the train can hold
     * @param nCars- how many cars the train has
     * @param passengerCapacity how manu people the train can fit. 
     */
    public Train(FuelType f, double fuelCapacity, int nCars, int passengerCapacity)
    {
        this.f= f; 
        this.fuelCapacity= fuelCapacity; 
        this.nCars= nCars; 
        this.passengerCapacity= passengerCapacity; 
        this.engine= new Engine(f, 100,100); 
        for (int counter= 1; counter<=this.nCars; counter++)
        {
            Car testingCar= new Car(passengerCapacity); 
        }

    }



    /** 
     * This method is an accessor for Engine.
     * @return Engine that is this cars engine.
    */
    public Engine getEngine()
    {
        return this.engine; 
    }

    /**this is an acessor method for a specific car
    * @return Car that is the car at the idx in the array list of the int given.
    */
    public Car getCar(int i)
    {
        Car notacar= new Car(0); 
        return notacar; 
    }
    /**
     * This function returns the MaxCapacity for the total train. 
     * @return int which is the MaxCapacity for the total train.
     */
    public int getMaxCapacity()
    {
        int MaxCapacity= carList.size()*passengerCapacity; 
        return MaxCapacity; 
    }
    /**
     * This funciton calculates how many seats there are remaining on the entire train.
     * @return int the total seats that are remaining on the entire train.
     */
    public int seatsRemaining()
    {
        int total_seats_remaining= 0;
        for (int counter= 1; counter<carList.size(); counter++)
        {
            total_seats_remaining+=carList.get(counter).seatsRemaining(); 
        }
        return total_seats_remaining; 
    }

    /**
     * This function prints the manifest of all the passengers on the entire train. 
     */
    public void printManifest()
    {
        for (int counter= 1; counter<carList.size(); counter++)
        {
            carList.get(counter).printManifest();
        }
    }


}
