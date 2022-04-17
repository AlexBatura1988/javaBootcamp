
public class Person {
	private final int ID;
	private static int idCounter = 0;
	private String firstName;
	private String lastName;
	private Address adddress;
	private String phoneNumber;
	private property PROPERTY;
	

	public Person(int id, String firstNmae, String lastName, Address adddress, String phoneNumber,property PROPERTY) {
		this.ID = idCounter++;
		this.firstName = firstNmae;
		this.lastName = lastName;
		this.adddress = adddress;
		this.phoneNumber = phoneNumber;
		this.PROPERTY = PROPERTY;
	}

	public int getId() {
		return ID;
	}

	public String getFirstNmae() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAdddress() {
		return adddress;
	}

	public void setAdddress(Address adddress) {
		this.adddress = adddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	enum property{
		CAR,
		HOUSE,
		APARTMENT
	}

}
