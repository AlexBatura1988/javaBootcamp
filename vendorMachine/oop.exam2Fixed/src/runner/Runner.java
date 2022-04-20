package runner;

import java.time.LocalDate;

import doll.Doll;
import electricToy.ElectricToy;
import electricToy.ElectricToy.CountBattery;
import kid.Kid;
import toy.Toy;

public class Runner {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(2022, 1, 4);
		Kid alex = new Kid("Alex", birthday);
		Kid kid = new Kid("kid", LocalDate.of(2015, 3, 1));

		Toy[] toys = new Toy[3];

		toys[0] = new Doll(alex, "barby", LocalDate.of(2022, 4, 19), "123", 3, Doll.TypeDoll.SOFT);
		toys[1] = new Doll(alex, "teddy", LocalDate.of(2021, 4, 19), "124", 1, Doll.TypeDoll.HARD);
		toys[2] = new ElectricToy(kid, "airplane", LocalDate.of(2022, 1, 3), "235", 3, CountBattery.FOUR);


		for (Toy item : toys) {
			item.play();

		}
	}
}
