package com.sachin.businessgame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player implements Comparable<Player> {

	int id;
	Map<Integer, HotelCellBlock> hotels = new HashMap<Integer, HotelCellBlock>();
	double currentAmount;
	int position = -1;
	int hotelBuyPrice ;
	int hotelRentPrice ;
	int maxCell ;
	
	public Player(int id, int playerInitialAmount, int maxCellPosition, int hotelBuyPrice, int hotelRentPrice) {
		this.id = id;
		this.currentAmount = playerInitialAmount;
		this.maxCell = maxCellPosition;
		this.hotelBuyPrice = hotelBuyPrice;
		this.hotelRentPrice = hotelRentPrice;
	}

	public void updateAmount(double price) {
		currentAmount += price;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public double getTotalAmount() {
		return currentAmount + hotels.size() * hotelBuyPrice;
	}

	public int updatePosition(int newPosition) {
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

		if (!cellBlock.isOccupied() && currentAmount >= hotelBuyPrice) {

			currentAmount = currentAmount - hotelBuyPrice;
			cellBlock.setOccupied();
			cellBlock.setPlayerId(id);

			hotels.put(cellPosition, cellBlock);

		} else {
			int playerId = cellBlock.getPlayerId();
			if(playerId != this.id)
			{
				currentAmount = currentAmount - hotelRentPrice;
				
				Player hotelOwner = players.get(playerId);
				hotelOwner.updateAmount(hotelRentPrice);
			}
			
		}

	}

}
