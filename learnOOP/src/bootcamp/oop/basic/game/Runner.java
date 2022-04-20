package bootcamp.oop.basic.game;

public class Runner {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		System.out.println("player 1 " +player1);
		System.out.println("player 2 " +player2);
		
		for(int i = 0; i < 4; i ++) {
			player1.eatBonus();
			System.out.println("player 1 " +player1);
			
		}
		for(int i = 0; i < 5; i ++) {
			player1.hitObstacle();
			System.out.println("player 1 " +player1);
		}
//		

	}

}
