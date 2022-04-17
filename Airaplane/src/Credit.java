
public class Credit {
	protected Airplane airplane;
	protected ClubMember clubMember;
	protected int baseMiles;
	protected int bonusMiles;
	protected Airplane[] flight;

	public Credit(Airplane airplane, ClubMember clubMember, int baseMiles, int bonusMiles, Airplane[] flight) {
		this.airplane = airplane;
		this.clubMember = clubMember;
		this.flight = flight;
		setBaseMiles(baseMiles);
		setBonusMiles(bonusMiles);

	}

	public int getBaseMiles() {
		return baseMiles;
	}

	public void setBaseMiles(int baseMiles) {
		if (airplane.plainArrival().getHour() < 5)
			this.baseMiles++;
	}

	public int getBonusMiles() {
		return bonusMiles;
	}

	public void setBonusMiles(int bonusMiles) {
		if (airplane.plainArrival().getHour() > 5) {
			this.bonusMiles++;
		}

	}

	public void addFlight() {
		flight = new Airplane[10];
		

	}

}
