package event_handling;

import org.springframework.context.ApplicationEvent;

public class drawEvent extends ApplicationEvent {

	public drawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return   "Draw Event Occured";
		
	}

}
