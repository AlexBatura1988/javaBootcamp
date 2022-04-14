package vendorMachine;

import vendorMachine.Chocolate.typeOfDrink;
import vendorMachine.Sprite.typeOfBottle;

public class AppleJuice extends ColdDrink {

	protected typeOfBottle TYPE_OF_BOTTLE;

    public AppleJuice() {
        this(3, 25, 200, ColdDrink.mainIngredient.SOFT_DRINK,typeOfBottle.CAN);
    }

    public AppleJuice(int temperature, int price, int volume, ColdDrink.mainIngredient MAIN_Ingredient, typeOfBottle TYPE_BOTTLE) {
        super(temperature, price, volume, ColdDrink.mainIngredient.SOFT_DRINK);
        this.TYPE_OF_BOTTLE = TYPE_BOTTLE;
    }

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

    @Override
    public String toString() {
        return "AppleJuice " + super.toString() + ", type of bottle: " + TYPE_OF_BOTTLE;
    }

}
