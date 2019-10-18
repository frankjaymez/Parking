package parkingLotSD;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Parking
{
	public static void main(String[] args) throws IOException
	   {
	   
	   try {
		   System.out.print("Enter the file name. Include the extension : "+"\n");

		   Scanner input = new Scanner(System.in);

		   File file = new File(input.nextLine());

		   input = new Scanner(file);
		   String text=input.nextLine();
		   int result=Integer.parseInt(text);
		   //System.out.println(result);
		   ParkingLot pl = new ParkingLot(result);
	       System.out.println("Lot Capacity = "+ pl.getCapacity()+"\n");
	       //System.out.println("\n");
	       
	       
		   while (input.hasNextLine())
		   {
		   String time;
		   String line = input.nextLine();
		                  if(line.equals("Enter:"))
		                  {
		                   line=input.nextLine();
		                   time=input.nextLine();
		           		   int timeStaying=Integer.parseInt(time);
		                   pl.parkACar(line,timeStaying);
		                  }
		               
		                  LinkedList<CarInformation> info=pl.getCars();
		                  if(line.equals("Exit:"))
		                  {	
		                	  
		                      line=input.nextLine();
		                      //int length=CarInformation.getTimeStaying();
		                      //System.out.println(length);

		                  for(int i=0; i<info.size();i++)
		                  {	
		                	  if(info.get(i).getName().compareTo(line)==0)
		                	  {//not getting here
		                		  int hoursParked=info.get(i).getTimeStaying();
		                		  double moneyOwed;
		                		  if(hoursParked<=1)
		                		  {
		                			  moneyOwed=5;
		                		  }
		                		  else if(hoursParked>=1 && hoursParked<=3)
		                		  {
		                			  moneyOwed=10;
		                		  }
		                		  else if(hoursParked>3 && hoursParked<=6)
		                		  {
		                			  moneyOwed=15;
		                		  }
		                		  else if(hoursParked<=24 && hoursParked>6)
		                		  {
		                			  moneyOwed=20;
		                		  }
		                		  else
		                		  {
		                			  moneyOwed= (hoursParked*.8)+10;
		                		  }
		                
		                		  System.out.println(line+ " is leaving the lot and owes: $"+moneyOwed);
		                		  System.out.println("Total time duration: "+hoursParked+  " Hours\n");

		                		  pl.leaveFromParking(info.get(i),line);
		                		  System.out.println("There are " +pl.getNum()+" cars currently in the lot"+"\n");
		                		  //System.out.println("its getting here");
		            
		                	  }
		                	  
		                  }
		                	  
		                  }
		   //System.out.println(line);
		   }
		   input.close();

		   } catch (Exception ex) 
	   		{
			   ex.printStackTrace();
	   		}
		   }

}
