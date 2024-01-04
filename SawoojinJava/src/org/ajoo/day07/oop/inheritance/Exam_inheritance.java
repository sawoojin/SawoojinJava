package org.ajoo.day07.oop.inheritance;

import org.ajoo.day07.oop.point.ColorPoint;
import org.ajoo.day07.oop.point.Point;

public class Exam_inheritance {

	public static void main(String[] args) {
		// (x, y)의 한점을 표현하는 Point 클래스와 이를 상속받아
		// 색을 가진 점을 표현하는 ColorPoint클래스를 만들고 활용
		Point p = new Point(1,2);
		p.showPoint();
		ColorPoint cp = new ColorPoint();
		cp.showPoint();
	}

}
