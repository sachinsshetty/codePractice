package com.sachin.businessgame;

import org.junit.Test;

import junit.framework.Assert;

public class TestGame {

	@Test
	public void gameTest() {

		int noPlayers = 3;

		BoardGame game = new BoardGame();

		String cellPosition = "E,E,J,H,E,T,J,T,E,E,H,J,T,H,E,E,J,H,E,T,J,T,E,E,H,J,T,H,J,E,E,J,H,E,T,J,T,E,E,H,J,T,E,H,E";
		int diceRoll[] = { 4, 4, 4, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11,
				10, 12 };

		game.initialiseGame(noPlayers, cellPosition, diceRoll);
		game.playGame();
		String result = game.displayResults();

		String expected = "Player [id=0, hotels=3, amount=1100.0]\n" + "Player [id=2, hotels=1, amount=900.0]\n"
				+ "Player [id=1, hotels=2, amount=850.0]\n";
		Assert.assertEquals(expected, result);
	}

}
