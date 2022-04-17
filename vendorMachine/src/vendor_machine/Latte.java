package vendor_machine;

/**
 * 
 * @author alexb
 *
 */

public class Latte extends HotDrink {
	private static final int SUGAR = 10;
	private static final int PRICE = 15;
	private static final int VOLUME = 250;
	private static final int TEMPRETURE = 105;

	/**
	 * empty Constructor
	 */

	public Latte() {
		this(TEMPRETURE, PRICE, VOLUME, SUGAR);
	}

	/**
	 * Constructor value initialization
	 * 
	 * @param temperature integer, temperature for drink
	 * @param price       integer, price for drink
	 * @param volume      integer, volume for drink
	 * @param sugar       integer, sugar for drink
	 */

	public Latte(int temperature, int price, int volume, int sugar) {
		super(temperature, price, volume, sugar);
	}
	
	/**
	 * function setVolume minimum volume is 100, max is 200
	 */

	@Override
	public void setVolume(int volume) {
		if (volume < 100) {
			this.volume = 100;
		} else
			super.setVolume(volume);
	}
	
	/**
	 * function produce checked quantity water and milk in vending machine and
	 * prepares drink to the specified parameters
	 */

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume && VendingMachine.milkQtt >= volume) {
			VendingMachine.waterQtt = VendingMachine.waterQtt - 50;
			VendingMachine.milkQtt = VendingMachine.milkQtt - volume + 50;
			System.out.println(this);
			System.out.println("water in machine " + VendingMachine.waterQtt);
			System.out.println("milk in machine " + VendingMachine.milkQtt);
		} else {
			System.out.println("no water or milk");
		}

	}
	
	/**
	 * function toString prints drink
	 */

	@Override
	public String toString() {
		return "Espresso [volume " + volume + ", temperature=" + temperature + ", price=" + price + ",sugar = " + sugar
				+ "]";
	}
}
