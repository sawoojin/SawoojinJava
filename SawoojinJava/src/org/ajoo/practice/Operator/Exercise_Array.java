package org.ajoo.practice.Operator;

import java.util.Scanner;

public class Exercise_Array {

	public void exercise01() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		1 2 3 4 5 6 7 8 9 10
		int nums [];
		nums = new int [10];
		for(int i = 0; i < 10; i ++) {
			nums[i] = i + 1;
			System.out.printf("%d", nums[i]);
		}
	}
	
	public void exercise02() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//
//		ex.
//		10 9 8 7 6 5 4 3 2 1
		int nums [];
		nums = new int [10];
		for(int i = 9; i >= 0; i --) {
			nums[i] = i + 1;
			System.out.printf("%d", nums[i]);
		}
	}
	
	public void exercise03() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		ex.
//		양의 정수 : 5
//		1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력 : ");
		int arraySize = sc.nextInt();
		int[] nums = new int[arraySize];
		
		for(int i = 0; i < nums.length; i ++) {
			System.out.printf("%d", i+1);
		}
		sc.close();
	}

	public void exercise04() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//
//		ex.
//		귤
		String fruits[] = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";	
		System.out.println(fruits[1]);
	}
	
	public void exercise05() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String target = sc.next();
		System.out.print("문자 : ");
		char aim = sc.next().charAt(0);
		int count = 0;
		int targets [] = new int[target.length()]; // 가변형 배열 길이
		for(int i = 0; i < targets.length; i++) {
			targets[i] = target.charAt(i);
		}
		System.out.print(target + "에 " + aim + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < targets.length; i++) {
			if(targets[i] == aim) {
				count++;
				System.out.print(i + " ");
			}
		}

		System.out.println("\n" + aim +"갯수 : " + count);
	}
	
	public void exercise06() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4 		0 ~ 6 사이 숫자 입력 : 7
//		금요일 							잘못 입력하셨습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		
		int number = sc.nextInt();
		String weeks[] = new String[7];
		weeks[1] = "일";
		weeks[2] = "월";
		weeks[3] = "화";
		weeks[4] = "수";
		weeks[5] = "목";
		weeks[6] = "금";
		weeks[7] = "토";
		System.out.println(weeks[number]);
		sc.close();
	}
	
	public void exercise07() {
		
	}
	
	public void exercise08() {
		
	}
	
	public void exercise09() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//
//		ex.
//		치킨 이름을 입력하세요 : 양념 		치킨 이름을 입력하세요 : 불닭
//		양념치킨 배달 가능 					불닭치킨은 없는 메뉴입니다.
		String chicken[] = {"양념", "간장", "파닭", "불닭", "크림"};
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String aim = sc.next();
		boolean check = false;
		for(String source : chicken) {
			if(source.equals(aim)) {
				 System.out.println(aim + "치킨 배달 가능");
				 check = true;
				 break;
			}
//			check++;
		}
		if(!check) {
			System.out.println(aim + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void exercise10() {
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String empNo = sc.next();
		char ssn [] = new char[empNo.length()];
		for(int i = 0; i < ssn.length; i++) {
			ssn[i] = empNo.charAt(i);
		}
		char copySsn[] = new char[empNo.length()];
		for(int i = 0; i < copySsn.length; i++) {
			if(i < 8) {
				copySsn[i] = ssn[i];
			}else {
				copySsn[i] = '*';
			}
		}
		System.out.println(copySsn);
	}
	
	public void exercise11() {
		
	}
	
	public void exercise12() {
		
	}

}
