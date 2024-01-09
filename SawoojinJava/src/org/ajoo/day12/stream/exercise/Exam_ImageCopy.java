package org.ajoo.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Theme1\img1.jpg
		// C:\Temp\copyimg.jpg 복사
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			int count;
			byte [] readBytes = new byte[1024*10];
			while((count = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, count);
				os.flush();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
