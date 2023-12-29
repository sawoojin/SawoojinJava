package org.ajoo.day05.oop.run;

import java.util.Scanner;

import org.ajoo.day05.oop.Book;
import org.ajoo.day05.oop.Circle;
import org.ajoo.day05.oop.exercise.Rectangle;

public class Run {

	public static void main(String[] args) {
//		Book book = new Book();
//		book.title = "춘향뎐";
		Book book1 = new Book("춘향뎐");
		System.out.printf("%s : %s\n", book1.title, "작자미상");
		
//		book.title =  "어린왕자";
//		book.author = "생택쥐페리";
		Book book2 = new Book("어린왕자", "생택쥐페리");
		System.out.printf("%s : %s\n", book2.title, book2.author);
		
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("너비 입력 : ");
		rect.width = sc.nextInt();
		System.out.print("높이 입력 : ");
		rect.height = sc.nextInt();
		int result = rect.getArea();
		System.out.println("사각형의 넓이는 " + result + "입니다.");
		sc.close();
		
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "청년피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
	}
}