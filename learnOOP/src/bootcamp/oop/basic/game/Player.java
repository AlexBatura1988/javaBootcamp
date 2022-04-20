package bootcamp.oop.basic.game;

public class Player {
	private static int totalPoints;
	private static int numPlayers;
	private int points = 0;
	private int lives = 3;

	static {
		totalPoints = 0;
		
	}

	public Player() {
		Player.numPlayers++;
	}

	public void eatBonus() {

		addPoints(100);

	}

	 void hitObstacle() {
		substructPoint(100);
	}

	private int addPoints(int numPoints) {
		this.points += numPoints;
		Player.totalPoints += numPoints;

		if (this.points > 150) {
			if (this.lives < 5) {
				this.lives++;

			}
		}
		return this.points;
	}

	private int substructPoint(int numPoints) {
		if (this.points > 0) {
			this.points -= numPoints;
			if (numPoints >= 100) {
				this.lives--;
				countOfLives();
			}
		}else {
			this.lives--;
			countOfLives();
		}
		return this.points;
	}

	public void countOfLives() {
		if (this.lives == 0) {
			System.out.println("Player is dead");
			Player.numPlayers--;
		}
	}

	@Override
	public String toString() {
		return "[points=" + points + ", lives=" + lives + " numOfPlayers " + numPlayers + "]";
	}

}
