package oopFixExam2;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(2020, 1, 4);
		Kid alex = new Kid("Alex", birthday);

		Toy[] toys = new Toy[4];

		toys[0] = new Doll("barby", LocalDate.of(2022, 4, 19), "123", Toy.ChildCategory.LOW_AGE, 3, Doll.TypeDoll.SOFT);
		toys[1] = new Doll("teddy", LocalDate.of(2021, 4, 19), "124", Toy.ChildCategory.MEDIUM_AGE, 1,
				Doll.TypeDoll.HARD);
		toys[2] = new ElectricToy("bmw", LocalDate.of(2020, 4, 19), "125", Toy.ChildCategory.HIGH_AGE, 3,
				ElectricToy.CountBattery.TWO);
		toys[3] = new ElectricToy("bike", LocalDate.of(200, 4, 19), "126", Toy.ChildCategory.HIGH_AGE, 2,
				ElectricToy.CountBattery.FOUR);

		for (Toy item : toys) {
			System.out.println(item);
		}
		for (Toy item : toys) {
			System.out.println(item);
			item.play();
			System.out.println(item);
		}
	}

}
