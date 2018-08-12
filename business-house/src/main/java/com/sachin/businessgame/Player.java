package com.sachin.businessgame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player implements Comparable<Player> {

	int id;
	Map<Integer, HotelCellBlock> hotels = new HashMap<Integer, HotelCellBlock>();
	double currentAmount;
	double totalAmount;
	int position = -1;

	public Player(int id, int pLAYER_INITIAL_AMOUNT) {
		this.id = id;
		this.currentAmount = pLAYER_INITIAL_AMOUNT;
	}

	public void updateAmount(double price) {
		currentAmount += price;
	}

	public void addHotel(int position, CellBlock cellBlock) {

		hotels.put(position, (HotelCellBlock) cellBlock);

	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public double getTotalAmount() {
		return currentAmount + hotels.size() * 200;
	}

	public int updatePosition(int newPosition) {
		int maxCell = 38;
		position += newPosition;
		if (position >= maxCell) {
			position = 0;
		}

		return position;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", hotels=" + getHotelSize(hotels) + ", amount=" + getTotalAmount() + "]";
	}

	private Integer getHotelSize(Map<Integer, HotelCellBlock> hotels) {
		return hotels == null ? 0 : hotels.size();
	}

	public int compareTo(Player currentPlayer) {
		if (this.getTotalAmount() > currentPlayer.getTotalAmount())
			return -1;
		else
			return 1;

	}

	public void updateParameter(HotelCellBlock cellBlock, int cellPosition, List<Player> players) {

		if (!cellBlock.isOccupied() && currentAmount >= 200) {

			currentAmount = currentAmount - 200;
			cellBlock.setOccupied();
			cellBlock.setPlayerId(id);

			hotels.put(cellPosition, cellBlock);

			} else {
			currentAmount = currentAmount - 50;

			int playerId = cellBlock.getPlayerId();
			Player hotelOwner = players.get(playerId);
			hotelOwner.updateAmount(50);

		}

	}

}
