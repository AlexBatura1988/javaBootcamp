package doll;

import java.time.LocalDate;

import playable.Playable;
import toy.Toy;

public class Doll extends Toy implements Playable {
	protected int dirtinessScale;
	protected TypeDoll typeDoll;

	public Doll(String name, LocalDate purchaseDate, String serialNumber, ChildCategory childCategory,
			int dirtinessScale, TypeDoll typeDoll) {
		super(name, purchaseDate, serialNumber, childCategory);
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
		  dirtinessScale++;
	}

	@Override
	public String toString() {
		return "Doll{" + "name='" + name + '\'' + "purchaseDate=" + purchaseDate + ", serialNumber='" + serialNumber
				+ '\'' + ", childCategory=" + childCategory + "dirtinessScale=" + dirtinessScale + ", typeDoll="
				+ typeDoll + '}';
	}

	public enum TypeDoll {
		SOFT, HARD
	}
}
