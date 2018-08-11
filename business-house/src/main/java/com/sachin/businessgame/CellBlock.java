package com.sachin.businessgame;

import java.util.List;

public abstract class CellBlock {

	public static final int HOTEL = 0;
	public static final int EMPTY = 1;
	public static final int JAIL = 2;
	public static final int TREASURE = 3;

	abstract int getPrice();

	int price;
	boolean isSpecial;
	int position;

}
