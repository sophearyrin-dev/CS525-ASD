package withobserver;

public class Counter extends Subject{
	
	private int count=0;

	
	public void increment(){
		count++;
		notify(count);
	}
	
	public void decrement(){
		count--;
		notify(count);
	}
}
