package doll;

import java.time.LocalDate;

import kid.Kid;
import playable.Playable;
import toy.Toy;

public class Doll extends Toy implements Playable {
	protected int dirtinessScale;
	protected TypeDoll typeDoll;

	public Doll(Kid kid, String name, LocalDate purchaseDate, String serialNumber, int dirtinessScale,
			TypeDoll typeDoll) {
		super(kid, name, purchaseDate, serialNumber);
		setDirtinessScale(dirtinessScale);
		this.typeDoll = typeDoll;
	}

	public int getDirtinessScale() {
		return dirtinessScale;
	}

	public void setDirtinessScale(int dirtinessScale) {
		this.dirtinessScale = dirtinessScale < 1 || dirtinessScale > 10 ? 1 : dirtinessScale;
	}

	@Override
	public void play() {
		int yearsToy = LocalDate.now().getYear() - purchaseDate.getYear();
		int yearsKid = LocalDate.now().getYear() - kid.getBirthDateYear();
		if (yearsToy == 0 && yearsKid >= 0 && yearsKid < 5) {
			System.out.println("you can play");
			dirtinessScale++;
			System.out.println(this);
		} else {
			System.out.println("you cannot play becouse years kid: " + yearsKid + ",years toy: " + yearsToy);

		}

	}

	@Override
	public String toString() {
		return "Doll{" + kid + "name='" + name + '\'' + "purchaseDate=" + purchaseDate + ", serialNumber='"
				+ serialNumber + '\'' + "dirtinessScale=" + dirtinessScale + ", typeDoll=" + typeDoll + '}';
	}

	public enum TypeDoll {
		SOFT, HARD
	}
}
