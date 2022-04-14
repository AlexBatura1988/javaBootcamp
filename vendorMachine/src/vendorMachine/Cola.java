package vendorMachine;

public class Cola extends ColdDrink {
	protected typeOfBottle TYPE_OF_BOTTLE;

	public Cola(int temperature, int price, int volume, mainIngredient MAIN_Ingredient, typeOfBottle TYPE_OF_BOTTLE) {
		super(temperature, price, volume, mainIngredient.SODA_DRINK);
		this.TYPE_OF_BOTTLE = TYPE_OF_BOTTLE;

	}

	public Cola() {
		this(3, 25, 150, mainIngredient.SODA_DRINK, typeOfBottle.CAN);
	}

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

	enum typeOfBottle {
		CAN, BOTTLE
	}

	public String toString() {
		return "Cola " + super.toString() + ", type of bottle: " + TYPE_OF_BOTTLE;
	}

}
