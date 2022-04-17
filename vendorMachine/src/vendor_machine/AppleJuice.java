package vendor_machine;

/**
 * 
 * @author alexb
 *
 */

public class AppleJuice extends ColdDrink {
	private static final int PRICE = 15;
	private static final int VOLUME = 50;
	private static final int TEMPRETURE = 4;
	protected TypeBottle TYPE_BOTTLE;
	protected SoftDrinkType SOFT_DRINK_TYPE;

	/**
	 * empty Constructor
	 */
	public AppleJuice() {
		this(TEMPRETURE, PRICE, VOLUME, ColdDrink.mainIngredient.SOFT_DRINK, TypeBottle.CAN, SoftDrinkType.PASTEURIZED);

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
	 * @param SOFT_DRINK_TYPE enum SoftDrinkType, soft drink type: squeezed or
	 *                        pasteurized
	 */

	public AppleJuice(int temperature, int price, int volume, ColdDrink.mainIngredient MAIN_Ingredient,
			TypeBottle TYPE_BOTTLE, SoftDrinkType SOFT_DRINK_TYPE) {
		super(temperature, price, volume, ColdDrink.mainIngredient.SOFT_DRINK);
		this.TYPE_BOTTLE = TYPE_BOTTLE;
		this.SOFT_DRINK_TYPE = SOFT_DRINK_TYPE;
	}

	/**
	 * function produce checked quantity water and milk in vending machine and
	 * prepares drink to the specified parameters
	 */

	@Override
	public void produce() {
		if ((VendingMachine.waterQtt >= volume) && (VendingMachine.milkQtt >= volume)) {
			VendingMachine.waterQtt -= volume;
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
		return "AppleJuice " + super.toString() + ", type of bottle: " + TYPE_BOTTLE + ",soft drink type: "
				+ SOFT_DRINK_TYPE;
	}
}
