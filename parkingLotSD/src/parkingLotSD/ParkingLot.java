package parkingLotSD;
import java.util.LinkedList;
public class ParkingLot
{
	private LinkedList<CarInformation> cars = null;//LL to hold curently parked cars
	   private int num = 0; //number of current parked cars
	   private int capacity = 0;//capacity of lot
	  
	   //constructor
	   public ParkingLot(int capacity)
	   {
		   this.cars = new LinkedList<CarInformation>();
	       this.capacity = capacity;
	       this.num = 0;
	   }
	  
	   public LinkedList<CarInformation> getCars()
	   {
	       return cars;
	   }

	   public int getNum()
	   {
	       return num;
	   }

	   public int getCapacity()
	   {
	       return capacity;
	   }
 
	   public void parkACar(String driver, int timeStaying)
	   {
	       if(this.num == this.capacity)
	       {
	           System.out.println("No more room in lot. HIT THE ROAD! \n");
	       }
	       
	       else
	       { 
	           CarInformation parkingCar = new CarInformation(driver,timeStaying);
	           cars.add(parkingCar); //new car added
	           System.out.println("New car entering the lot: ");
	           System.out.println(parkingCar);
	           this.num++;
	       }
	       
	   }
	   
	   public void leaveFromParking(CarInformation pc,String driver)
	   {
	       boolean isLeft = cars.remove(pc); 
	       if(isLeft)
	       { 
	           this.num--;
	       }
	       else
	       {
	           System.out.println("Customer not found in lot");
	       }
	      
	   }

}