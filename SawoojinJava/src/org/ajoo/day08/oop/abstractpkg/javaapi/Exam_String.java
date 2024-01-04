package org.ajoo.day08.oop.abstractpkg.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello Java";
		msg = new String("Hello Java");
		
		String data1 = new String("C#");
		String data2 = new String("C++");
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		// 문자열 포함
		System.out.println("#이 있는가? : " + data1.contains("#"));
		// 문자열 연결
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 " + data1);
		
		
	}

}
