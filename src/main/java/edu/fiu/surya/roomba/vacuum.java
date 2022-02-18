/**
 * 
 */
package edu.fiu.surya.roomba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Student
 *
 */
public class vacuum implements GenericComponent {
	
	private String size;
	private String model;
	private String color;
	private String manufacturer;
	private boolean light;
	private App myapp;
	private vacuum myvacuum;
	private ProcessingUnit myprocessingunit;
	private server myserver;
	
	public vacuum() {
		myapp = new App();
		myprocessingunit = new ProcessingUnit();
		myserver = new server();
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("I am iRobot Roomba s9+, I love Cleaning");
	}
	
	public void collectTrash()
	{
		// Vacuum has the main function of collecting Trash
	}
	
	public void returnToDockingStation()
	{
		// When the dirt bag gets full, or the vacuum has low power or the Vacuum is given the command the Vacuum returns back to Docking Station
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Vacuum";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myapp, myprocessingunit, myserver); // add all your sub components
		return internalComponents;

	}

}
