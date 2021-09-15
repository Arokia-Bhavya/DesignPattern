package observer;
import java.util.HashMap;
import java.util.Map;

public class EventManager {
private Map<String,EventListener> listeners=new HashMap<String,EventListener>();

void subscribe(String eventType, EventListener listener)
{
	listeners.put(eventType, listener);
	System.out.println("publisher subscribing eventType "+eventType);
}

void unsubscribe(String eventType, EventListener listener)
{
	listeners.remove(eventType, listener);
	System.out.println("publisher unsubscribing eventType "+eventType);
}

void notify(String eventType, String data) {
	for(Map.Entry<String,EventListener> eventListener:listeners.entrySet())
		eventListener.getValue().update(data);	
		System.out.println("publisher executing eventType "+eventType);
	}

}
