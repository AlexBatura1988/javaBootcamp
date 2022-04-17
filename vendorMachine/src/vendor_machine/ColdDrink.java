package vendor_machine;

public abstract class ColdDrink extends Drink {
	mainIngredient MAIN_Ingredient;

	public ColdDrink(int temperature, int price, int volume, mainIngredient MAIN_Ingredient) {
		super(temperature, price, volume);
		this.MAIN_Ingredient = MAIN_Ingredient;
	}

	public ColdDrink() {

	}

	@Override
	public void setTemperature(int temperature) {
		if (temperature >= 0 && temperature < 6) {
			this.temperature = temperature;
		} else {
			setTemperature(5);
		}
	}

	public abstract void produce();

	@Override
	public String toString() {
		return super.toString() + " main ingredient " + MAIN_Ingredient;
	}

	enum mainIngredient {
		SOFT_DRINK, SODA_DRINK;
	}

}
