/**
 * 
 */
package edu.fiu.surya.roomba;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Student
 *
 */
public class ProcessingUnit implements SelfCheckCapable{
	private String Processor;
	private String manufacturer;
	private String transmitter;
	private String receiver;
	
	public void processInputFromApp()
	{
		// various Commands are given by the User on the application which are interpreted by Processing Unit
	}
	
	public void relaySensorDataToApp()
	{
		// Processing Unit interprets and shares this information provided by Sensor to the App
	}
	
	public void connectWifi()
	{
		// Processing Unit gets Vacuum connected to the Wifi
	}
	
	public void connectSensor()
	{
		// All the Sensors are connected to the Processing Unit
	}
	
	public void activateLight()
	{
		// Processing Unit turns the Light on as soon as the Vacuuming starts
	}
	
	public void activateMotor()
	{
		// Processing Unit turns the Motor on as soon as the Vacuum command is given
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ProcessingUnit";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
