package org.ajoo.day10.oop.objectpkg;

public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		// 문자열로 출력하려면 오버라이딩!
		System.out.println("객체 출력 : " + obj);
		// toString() 은 생략 가능함.
		// 객체를 출력하면 toString() 의 결과로 출력이 됨.
	}

	public static void main(String[] args) {
		print(new Exam_ObjectProperty());
		
		String javaStr = "Java"; 
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
		if(javaStr.equals(javaStr3)) { 	// 다릅니다(주소다름, new사용) && 문자열 비교는 equals
										// equals는 Object 클래스의 메소드
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}

	}

}
