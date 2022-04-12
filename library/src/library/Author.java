package library;

public class Author {
	private String name;
	private char gender;

	public Author(String name, char gender) {
		this.name = name;
		setGender(gender);

	}

	public void setGender(char gender) {
		 this.gender = (gender == 'm' || gender == 'f') ? gender : 'm';
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", gender=" + gender + "]";
	}

}
