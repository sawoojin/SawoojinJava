package org.ajoo.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/ajoo/day12/stream/outputstream/writing3.txt");
			byte [] data = "마지막 입출력".getBytes();
			os.write(data, 0, 9);
			os.flush(); // 버퍼 비우기
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
