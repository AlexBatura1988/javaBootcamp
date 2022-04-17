
public class ClubMember {
	private static int countMmember = 0;
	private String firstName;
	private String lastName;
	private final int MEMBER_ID;
	public ClubMember(String firstName, String lastName, int MEMBER_ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.MEMBER_ID = countMmember++;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getMEMBER_ID() {
		return MEMBER_ID;
	} 
	
	
	

}
