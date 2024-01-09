package org.ajoo.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/org/ajoo/day12/stream/inputstream/reading.txt");
			int readByte;
			do {
				readByte = is.read(); // 한 바이트씩 읽어서 출력하는 read()
				System.out.print((char)readByte);				
				
			}
			while(readByte != -1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
