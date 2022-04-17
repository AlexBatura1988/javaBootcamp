package vendor_machine;

/**
 * 
 * @author alexb
 *
 */

public class Cappuccino extends HotDrink {
	private static final int SUGAR = 1;
	private static final int PRICE = 10;
	private static final int VOLUME = 50;
	private static final int TEMPRETURE = 65;

	/**
	 * empty Constructor
	 */

	public Cappuccino() {
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

	public Cappuccino(int temperature, int price, int volume, int sugar) {
		super(temperature, price, volume, sugar);

	}

	/**
	 * function setVolume set volume from 150 to 200
	 */

	@Override
	public void setVolume(int volume) {
		if (volume < 150) {
			this.volume = 150;
		} else
			super.setVolume(volume);

	}

	/**
	 * function produce checked quantity water and milk in vending machine and
	 * prepares drink to the specified parameters
	 */

	@Override
	public void produce() {
		if (VendingMachine.waterQtt > volume && VendingMachine.milkQtt > volume) {
			VendingMachine.waterQtt = VendingMachine.waterQtt - 100;
			VendingMachine.milkQtt = VendingMachine.milkQtt - volume + 100;
			System.out.println(this);
			System.out.println(VendingMachine.waterQtt);
			System.out.println(VendingMachine.milkQtt);
		} else {
			System.out.println("no water or milk");
		}

	}

	/**
	 * function toString prints drink
	 */

	@Override
	public String toString() {
		return "Espresso [volume " + volume + ", temperature=" + temperature + ", price=" + price + ",sugar: " + sugar
				+ "]";
	}
}
