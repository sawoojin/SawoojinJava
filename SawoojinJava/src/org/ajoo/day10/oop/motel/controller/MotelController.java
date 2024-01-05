package org.ajoo.day10.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import org.ajoo.day10.oop.motel.model.vo.Room;

public class MotelController {
	
	List<Room> roomList;
	public MotelController() {
		roomList = new ArrayList<Room>(10);
		for(int i = 0; i < 10; i++) {
			roomList.add(new Room(false));
		}
	}
	public void checkIn(int roomNum) {
		roomList.set(roomNum-1, new Room(true));
	}
	public List<Room> printAllRooms() {
		return roomList;
	}
	public void checkOut(int roomNum) {
		roomList.set(roomNum-1, new Room(false));
	}

}
