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
public class server implements SelfCheckCapable{
	private String host;
	private String port;
	private String nodeagent;
	
	public void validateUpdate()
	{
		// updates are available for various versions or models. Server checks if it is possible to deloy the updates in terms of the hardware available, speed and storage 
	}
	
	public void provideUpdate()
	{
		// server gives the updates to be provided to the roomba
	}
	
	public void connectToApp()
	{
		// server connects to app when app reaches out for updates or other functions
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Server";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	
}
