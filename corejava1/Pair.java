package com.preethi.test;

import java.util.Objects;

public class Pair<A1, A2> {

	private int x;
	private int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return x == other.x && y == other.y;
	}



	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + "]";
	}

}
