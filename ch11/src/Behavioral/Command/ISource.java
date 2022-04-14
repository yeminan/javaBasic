package Behavioral.Command;

public interface ISource{ 
	public void setMediator(Mediator mediator); 
	public void eventOccured(String event); 
}