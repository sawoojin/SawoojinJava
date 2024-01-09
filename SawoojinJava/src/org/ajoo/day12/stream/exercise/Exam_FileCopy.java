package org.ajoo.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		// C에있는 파일을 E드라이브로 복차
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user1\\Piccturs\\Felite.png");
			os = new FileOutputStream("E:\\teampworkspace\\Fclass_icon.png");
			byte [] readBytes = new byte[1024];
			int readByteCount;
			while(true) {
				os.write((readByteCount = is.read(readBytes)) != -1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
