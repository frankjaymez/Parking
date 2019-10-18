package parkingLotSD;
import java.sql.Timestamp;
public class CarInformation
{
	 private String driver;//drivers name
	 private Timestamp timestampArrive; //timestamp given to driver
	 private int timeStaying;
	  

	   public CarInformation(String driver,int timeStaying)
	   {
	       this.driver = driver;
	       this.timestampArrive = new Timestamp(System.currentTimeMillis());
	       this.timeStaying=timeStaying;
	   }

	 public String getName() 
	 {
	    return driver;
	 }

	 public void setName(String name) 
	 {
	    this.driver = name;
	 }

	 public Timestamp getTimestampArrive() 
	 {
	    return timestampArrive;
	 }

	   public String toString()
	   {
	       return "Driver: " + driver + "\n" + "Timestamp: " + timestampArrive + "\n";
	   }
	  public int getTimeStaying()
	  {
		  return timeStaying;
	  }

}
