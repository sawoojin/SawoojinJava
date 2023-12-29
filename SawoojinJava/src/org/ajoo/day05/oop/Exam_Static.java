package org.ajoo.day05.oop;

class StaticSample {
	public int num;
	public static int input;
	
	public void sampleMethod() {
		
	}
	public void googMethod() {
		
	}
	public static void originMethod() {
		input = 2024;
	}
}
public class Exam_Static {

	public static void main(String[] args) {
//		StaticSample.input = 120;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
//		StaticSample smpl = new StaticSample();
//		smpl.num = 120;
//		smpl.sampleMethod();
//		smpl.googMethod();

	}

}
