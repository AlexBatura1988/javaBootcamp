package vendor_machine;

/**
 * 
 * @author alexb
 *
 */

public class Chocolate extends HotDrink {
	private static final int SUGAR = 10;
	private static final int PRICE = 15;
	private static final int VOLUME = 250;
	private static final int TEMPRETURE = 65;
	typeOfDrink TYPE_OF_DRINK;

	/**
	 * empty Constructor
	 */

	public Chocolate() {
		this(TEMPRETURE, PRICE, VOLUME, SUGAR, typeOfDrink.MILK);
	}

	/**
	 * Constructor value initialization
	 * 
	 * @param temperature integer, temperature for drink
	 * @param price       integer, price for drink
	 * @param volume      integer, volume for drink
	 * @param sugar       integer, sugar for drink
	 * @param typeOfDrink enum ,type of drink:water or milk
	 */

	public Chocolate(int temperature, int price, int volume, int sugar, typeOfDrink TYPE_OF_DRINK) {
		super(temperature, price, volume, sugar);
		this.TYPE_OF_DRINK = TYPE_OF_DRINK;
	}

	/**
	 * function produce checked quantity water and milk in vending machine and
	 * prepares drink to the specified parameters
	 */

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume && VendingMachine.milkQtt >= volume) {
			if (TYPE_OF_DRINK == typeOfDrink.WATER) {
				VendingMachine.waterQtt -= volume;
			} else {
				VendingMachine.milkQtt -= volume;
			}
			System.out.println(this);
			System.out.println("water in macine " + VendingMachine.waterQtt);
			System.out.println("milk in machine " + VendingMachine.milkQtt);

		} else {
			System.out.println("no water or milk");
		}

	}

	@Override
	public String toString() {
		return "chocolate " + super.toString() + " sugar: " + sugar + ", type of drink: " + TYPE_OF_DRINK;
	}

	/**
	 * function toString prints drink
	 */

	enum typeOfDrink {
		WATER, MILK
	}
}
