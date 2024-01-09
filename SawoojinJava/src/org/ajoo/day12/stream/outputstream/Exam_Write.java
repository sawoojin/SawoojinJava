package org.ajoo.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/ajoo/day12/stream/outputstream/writing.txt");
			byte [] data = "헬로우 입출력".getBytes();
			for(int i = 0; i < data.length; i ++)
				os.write(data[i]);
				os.flush();
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
