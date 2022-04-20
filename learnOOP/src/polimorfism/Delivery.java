package polimorfism;

public abstract class Delivery {
	
	private static long counter = 0;
	protected String address;
	protected String clientName;
	protected final long id;
	
	public Delivery(String address, String clientName) {
	this.address=address;
	this.clientName = clientName;
	this.id = counter++;
	}
	public abstract void deliver();
	@Override
	public String toString() {
	return String.format("delivery number #%d for %s at %s\n", id, clientName, address);
	}
	
	
	
	
	
	 
	

}
