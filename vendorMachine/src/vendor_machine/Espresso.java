package vendor_machine;

/**
 * 
 * @author alexb
 *
 */
public class Espresso extends HotDrink {
	private static final int SUGAR = 5;
	private static final int PRICE = 15;
	private static final int VOLUME = 100;
	private static final int TEMPRETURE = 85;

	/**
	 * empty Constructor
	 */

	public Espresso() {
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

	public Espresso(int temperature, int price, int volume, int sugar) {

		super(temperature, price, volume, sugar);
		setVolume(volume);

	}

	/**
	 * function setVolume set volume to 50 , 100 or 150, default 50
	 */
	@Override
	public void setVolume(int volume) {
		if (volume == 50 || volume == 100 || volume == 150) {
			super.setVolume(volume);
		} else
			setVolume(50);
	}

	/**
	 * function produce checked quantity water and milk in vending machine and
	 * prepares drink to the specified parameters
	 */

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume) {
			VendingMachine.waterQtt = VendingMachine.waterQtt - volume;
			System.out.println(this);
			System.out.println("water in machine " + VendingMachine.waterQtt);
			System.out.println("milk in machine " + VendingMachine.milkQtt);
		} else {
			System.out.println("no water in machine!!");
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
