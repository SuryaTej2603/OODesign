/**
 * 
 */
package edu.fiu.surya.roomba;

/**
 * @author Student
 *
 */
public class App {
	private double version;
	private String developer;
	private String size;
	
	public void processSensorData()
	{
		//data from multiple sensors helps build map of the floor, this information is processed on the app
	}
	
	public void relayInputToProcessingUnit()
	{
		//certain commands are given by user which are given to the Processing Unit to be carried out
	}
	
	public void activateVacuum()
	{
		//vacuum can be turned on through the app
	}

	public void activateLight()
	{
		//light can be turned on through the app
	}
	
	public void displayInformation()
	{
		//various vacuum related information can be seen on the App
	}
	
	public void createMap()
	{
		//based on the inputs from the Sensor App builds the map of the floor
	}
	

	public void scheduleVacuumTiming()
	{
		//Custom scheduling of the Vacuum can be done on the app in the order to run Vacuum without any intervention
	}
	
	public void createZone()
	{
		// on Maps, zones are created so that specific areas can be avoided and specific areas can be repeatedly cleaned
	}
	
}
