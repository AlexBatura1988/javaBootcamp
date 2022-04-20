package bootcamp.oop.basic.polomorfism.runner;

import java.util.Random;

import polimorfism.ParselDelivery;
import polimorfism.PizzaDelivery;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Sitting in my home office, I suddenly heard the doorbell.\n"
				+ "I wonder who might it be ?");

	PizzaDelivery pizza = new PizzaDelivery(
	new String[]{"a tomato and mushrom",  
	"a zukini with extra cheese"},
	120f,
	"Bat Yam",
	"Alex");

	ParselDelivery parcel = new ParselDelivery(2, true, "New York City", "Guy Tordjman");

	Random rand = new Random();
	int opt = rand.nextInt();

	if (opt%2 == 0) {
	System.out.println("Great it's the pizza guy!");
	pizza.deliver();
	}else {
	parcel.deliver();
	System.out.println("Oh I totally forgot I'd ordered this!");
	}
	System.out.println("Great, thanks a lot");
	}
}
