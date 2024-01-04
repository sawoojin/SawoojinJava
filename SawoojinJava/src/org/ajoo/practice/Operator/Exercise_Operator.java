package org.ajoo.practice.Operator;

import java.util.Scanner;

public class Exercise_Operator {

	public void exercise01() {
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
//		ex) 정수 : -9   양수가 아니다
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 0) System.out.println("양수다.");
		else System.out.println("양수가 아니다.");
		sc.close();
	}
	
	public void exercise02() {
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
//		ex.정수 : -9    음수다
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) System.out.println("양수다.");
		else if(num == 0) System.out.println("0이다.");
		else if(num < 0)System.out.println("음수다.");
		sc.close();
	}
	
	public void exercise03() {
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
//		ex.정수 : 5    홀수다
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) System.out.println("짝수다.");
		else System.out.println("홀수다.");
		sc.close();
	}
	
	public void exercise04() {
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입 력 받고 1인당 동일하게 나눠가진
//		사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
//		ex.인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int peopleNum = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candyNum = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + (candyNum / peopleNum));
		System.out.println("남는 사탕 개수 : " + (candyNum % peopleNum));
		sc.close();
	}
	
	public void exercise05() {
//		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 
//		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
//		ex.
//		이름 : 최용자
//		학년(숫자만) : 3
//		반(숫자만) : 4
//		번호(숫자만) : 15
//		성별(M/F) : 여학생
//		성적(소수점 아래 둘째자리까지) : 85.75
//		3학년 4반 15번 최용자 여학생의 성적은 85.75이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();

		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.println("성별(M/F) : ");
		char gender1 = sc.next().charAt(0);
		String gender2;
		if (gender1 == 'M') gender2 = "남학생";
		else if(gender1 != 'M') gender2 = "여학생";
		else gender2 = "오류";

		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		sc.close();
		
		System.out.println("이름 : " + name);
		System.out.println("학년(숫자만) : " + grade);
		System.out.println("반(숫자만) : " + classNum);
		System.out.println("번호(숫자만) : " + num);
		System.out.println("성별(M/F) : " + gender2);
		System.out.println("성적(소수점 아래 둘째자리까지) : " + score);
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classNum, num, name, gender2, score);
	}
	
	public void exercise06() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, (19세 초과)인지 출력하세요.
//		ex.	나이 : 19
//		청소년
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String status;
		
		if (age <= 13) status = "어린이";
		else if(13 < age && 19 >= age) status = "청소년";
		else if(19 < age) status = "성인";
		else status = "오류";
		System.out.println(status);
		sc.close();
	}
	
	public void exercise07() {
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계(국어+영어+수학)와 
//		평균(합계/3.0)을 구하세요. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 세 과목 점수가 각각 40점 이상이면서
//		평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		ex.
//		국어 : 60
//		영어 : 80
//		수학 : 40
//
//		합계 : 180
//		평균 : 60.0
//		합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = (double)sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n",avg);
		if(korean >= 40 && english >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		}
		else System.out.println("불합격");
		sc.close();
	}
	
	public void exercise08() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char socialNum = sc.next().charAt(7);
		switch(socialNum) {
			case '1' :
			case '3' : System.out.println("남자"); break;
			case '2' :
			case '4' : System.out.println("여자"); break;
			default : System.out.println("오류");
		}
		sc.close();
	}
	
	public void exercise09() {
//		키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
//		(단, num1은 num2보다 작아야 함)
//
//		ex.
//		정수1 : 4
//		정수2 : 11
//		입력 : 13
//
//		true
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		if(num3 > num2 || num3 <= num1) System.out.println(true);
		else System.out.println(false);

		sc.close();
	}
	
	public void exercise10() {
//		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
//
//		ex.
//		입력1 : 5
//		입력2 : -8
//		입력3 : 5
//
//		false
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3) System.out.println(true);
		else System.out.println(false);
		sc.close();
	}
	
	public void exercise11() {
//		A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
//		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
//		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
//
//		ex.
//		A사원의 연봉 : 2500
//		B사원의 연봉 : 2900
//		C사원의 연봉 : 2600
//		A사원 연봉/연봉+a : 2500/3500.0
//		3000 이상
//		B사원 연봉/연봉+a : 2900/2900.0
//		3000 미만
//		C사원 연봉/연봉+a : 2600/2989.9999999999995
//		3000 미만
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int salA = sc.nextInt();
		double bonusA = (double)salA + ((double)salA * 0.4);
		System.out.print("B사원의 연봉 : ");
		int salB = sc.nextInt();
		double bonusB = (double)salB;
		System.out.print("C사원의 연봉 : ");
		int salC = sc.nextInt();
		double bonusC = (double)salC + ((double)salC * 0.15);
		
		System.out.println("A사원의 연봉/연봉+a : " + salA + "/" + bonusA);
		if(bonusA < 3000) System.out.println("3000 미만");
		else System.out.println("3000 이상");
		System.out.println("B사원의 연봉/연봉+a : " + salB + "/" + bonusB);
		if(bonusB < 3000) System.out.println("3000 미만");
		else System.out.println("3000 이상");
		System.out.println("C사원의 연봉/연봉+a : " + salC + "/" + bonusC);
		if(bonusC < 3000) System.out.println("3000 미만");
		else System.out.println("3000 이상");
		
		sc.close();
	}
}
