package org.ajoo.day10.oop.motel.model.vo;

public class Room {
	private boolean isAvailable;
	
	public Room() {}
	
	public Room(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public final boolean isAvailable() {
		return isAvailable;
	}
	public final void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
