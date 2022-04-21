package oopFixExam2;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		
		Kid kid1 = new Kid("Alex", LocalDate.of(2022, 2, 25));
		Kid kid2 = new Kid("Moshe", LocalDate.of(2020, 10, 15));
		

		Toy[] toys = new Toy[4];

		toys[0] = new Doll(kid1,"barby", LocalDate.of(2022, 4, 19), "123", 3, Doll.TypeDoll.SOFT);
		toys[1] = new Doll(kid1,"teddy", LocalDate.of(2021, 4, 19), "124", 1, Doll.TypeDoll.HARD);
		toys[2] = new ElectricToy(kid2,"bmw", LocalDate.of(2020, 4, 19), "125", 3, ElectricToy.CountBattery.TWO);
		toys[3] = new ElectricToy(kid2,"bike", LocalDate.of(2022, 4, 19), "126", 2, ElectricToy.CountBattery.FOUR);

		for (Toy item : toys) {
			System.out.println(item);
		}
		for (Toy item : toys) {
			item.play();
			
		}
	}

}
