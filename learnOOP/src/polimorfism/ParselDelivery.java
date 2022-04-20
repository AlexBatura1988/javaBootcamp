package polimorfism;

public class ParselDelivery extends Delivery {
	protected int numItems;
	protected boolean isDoor;
	public ParselDelivery(int numItems, boolean isDoor, String address, String clientName) {
		super(address, clientName);
		this.numItems = numItems;
		this.isDoor = isDoor;		
	}
	
	public void deliver() {
		System.out.println("-----------------------");
		System.out.print("Hi I have a parcel ");
		System.out.println(this);
		System.out.println("-----------------------");
		}
	
	@Override
	public String toString() {
	String msg = super.toString();
	msg += String.format("Total of %d items:\n", numItems);
	if(isDoor)
	msg += "Client home";
	else
	msg += "Client not at home";
	return msg;
	}

}
