package bootcamp.oop.basic.ex1.remotecon;

public class RemoteControl {
	private String transmitMethod;

	public RemoteControl(String transmitMethod) {
		setTransmitMethod(transmitMethod);
	}

	public String getTransmitMethod() {
		return transmitMethod;
	}

	public void setTransmitMethod(String transmitMethod) {
		if (transmitMethod == "RF" || transmitMethod == "IR") {
			this.transmitMethod = transmitMethod;
		} else {
			this.transmitMethod = "IR";
		}
	}

}
