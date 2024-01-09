package org.ajoo.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/org/ajoo/day12/stream/inputstream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while(true) {
				readByteCount =	is.read(readBytes, 0, 3);
				if (readByteCount == -1) break;
				result += new String(readBytes, 0, readByteCount);		
			}
			System.out.println(result);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
