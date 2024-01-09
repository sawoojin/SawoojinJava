package org.ajoo.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		// c:\windows\system.ini 복사
		// c:\Temp\system.txt 단, 문자기반 스트림을 사용하세요
		Reader reader = null;
		Writer writer = null;
		String src = "c:\\windows\\system.ini";
		String dest = "c:\\Temp\\system.txt";
		
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			char [] cBuf = new char[10];
			int readCharCount = reader.read();
			while(true) {
				writer.write(cBuf);
				if(readCharCount == -1) break;
				writer.flush();
			}
			System.out.println("복사");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
