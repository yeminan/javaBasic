package Behavioral.Command;

public class Display implements IDestination{ 
	@Override 
	public void receiveEvent(String from, String event){ 
		System.out.println("Display : from " + from + " event : " + event); 
	} 
}
