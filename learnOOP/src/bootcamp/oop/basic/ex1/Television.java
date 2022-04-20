package bootcamp.oop.basic.ex1;

import java.io.IOException;
import java.util.Calendar;

import bootcamp.oop.basic.ex1.remotecon.RemoteControl;

public class Television extends HomeAppliance {
	protected float size;
	protected String model;
	protected RemoteControl remControl;

	public Television(String manufacturer, int purchaseYear, int powCon, float size, String transmitMethod) {
		super(manufacturer, purchaseYear, powCon);
		setSize(size);
		setModel("A12");
		remControl = new RemoteControl(transmitMethod);

	}

	public Television(float size) {
		this("Generic", (Calendar.getInstance()).get(Calendar.YEAR), 1, size, "RF");

	}

	public Television() {
		this(40);
	}

	public void setSize(float size) {
		if (size < 2.5f || size > 120f)
			size = 10f;
		this.size = size;
	}

	public void setModel(String model) {
		if (model.length() < 3) {
			System.out.println("Exception in setModel");
			return;
		}

		char ch = model.charAt(0);
		if (!Character.isLetter(ch)) {
			model = "A" + model;
		}
		char ch1 = model.charAt(1);
		char ch2 = model.charAt(2);
		if (!Character.isDigit(ch1) || !Character.isDigit(ch2)) {
			model = ch + "00";
		}
		model = model.substring(0, 3);
		this.model = model;
	}

	@Override
	public String toString() {
		return "Television [size=" + size + ", model=" + model + ", remControl=" + remControl.getTransmitMethod()
				+ ", manufacturer=" + manufacturer + ", purchaseYear=" + purchaseYear + "power consuption " 
				+ powerConsumption + "]";
	}

	public float sizeInCM() {
		return size * 2.54f;
	}

	public int isBigger(Television other) {
		float diff = this.size - other.size;
		if (diff > 0) {
			return 1;
		} else if (diff < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int getConsuption(int powerConsumption, int hour) {

		return powerConsumption * hour;
	}

	@Override
	public Appendable append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(char c) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
