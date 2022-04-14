package vendorMachine;

import vendorMachine.Cola.typeOfBottle;
import vendorMachine.ColdDrink.mainIngredient;

public class Sprite extends ColdDrink {
	protected typeOfBottle TYPE_OF_BOTTLE;

	public Sprite(int temperature, int price, int volume, mainIngredient MAIN_Ingredient, typeOfBottle TYPE_OF_BOTTLE) {
		super(temperature, price, volume, mainIngredient.SODA_DRINK);

	}

	public Sprite() {
		this(3, 25, 300, mainIngredient.SODA_DRINK, typeOfBottle.CAN);
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
enum typeOfBottle{
	CAN,
	BOTTLE
}

	public String toString() {
		return "Sprite " + super.toString() + ", type of bottle: " + TYPE_OF_BOTTLE;
	}

}
