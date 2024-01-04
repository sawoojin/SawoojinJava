package org.ajoo.day07.oop.inheritance;

public class Exam_Protected {
	public static void main(String [] args) {
		
	}
}

class sub extends Super {
	private int childMoney;
	void set() {
		super.pub = 11;
		super.def = 13;
		super.pro = 4;
	}
}
class ShapePoint extends Point {
	private String shape;
	void set() {
		super.pub = 11;
//		super.def = 14;
		super.pri = 25;
	}
}