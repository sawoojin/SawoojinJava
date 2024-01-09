package org.ajoo.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일 입력(확장자 제외) : ");
		String textname = sc.next();
		String dest = "src/org/ajoo/day12/stream/exercise/" + textname + ".txt";
		Writer writer = null;
		try {
			writer = new FileWriter(dest);
			System.out.println("종료는 exit");
			for(int i = 0;; i++) {
				System.out.print(i + " : ");
				String text = sc.nextLine();
				if(text.equals("exit")) break;
				writer.write(text + "\n");
			}
			writer.flush();
			System.out.println("파일 저장이 완료되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
