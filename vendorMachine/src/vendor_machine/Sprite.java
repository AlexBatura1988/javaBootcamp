package vendor_machine;

/**
 * 
 * @author alexb
 *
 */

public class Sprite extends ColdDrink {
	private static final int PRICE = 10;
	private static final int VOLUME = 100;
	private static final int TEMPRETURE = 2;
	protected TypeBottle TYPE_OF_BOTTLE;

	/**
	 * empty Constructor
	 */

	public Sprite() {
		this(TEMPRETURE, PRICE, VOLUME, mainIngredient.SODA_DRINK, TypeBottle.CAN);
	}

	/**
	 * Constructor value initialization
	 * 
	 * @param temperature     integer, temperature for drink
	 * @param price           integer, price for drink
	 * @param volume          integer, volume for drink
	 * @param MAIN_Ingredient enum mainIngredient, main ingredient for drink: soda
	 *                        or soft
	 * @param TYPE_BOTTLE     enum TypeBottle, type bottle for drink: bottle or can
	 * 
	 */

	public Sprite(int temperature, int price, int volume, mainIngredient MAIN_Ingredient, TypeBottle TypeBottle) {
		super(temperature, price, volume, mainIngredient.SODA_DRINK);
		this.TYPE_OF_BOTTLE = TypeBottle;

	}

	/**
	 * function produce checked quantity water and milk in vending machine and
	 * prepares drink to the specified parameters
	 */

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume && VendingMachine.milkQtt >= volume) {
			VendingMachine.waterQtt -= volume;
			System.out.println(this);
			System.out.println("water in macine " + VendingMachine.waterQtt);
			System.out.println("milk in machine " + VendingMachine.milkQtt);

		} else {
			System.out.println("no water or milk");
		}
	}

	/**
	 * function toString prints drink
	 */

	public String toString() {
		return "Sprite " + super.toString() + ", type of bottle: " + TYPE_OF_BOTTLE;
	}

}
