package org.ajoo.day13.file;

import java.io.File;
import java.io.IOException;

public class Exam_File {

	public static void main(String[] args) {
		File file = new File("C:\\Temp\\copyimg.jpg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.printf("파일 이름 : %s \n파일 경로 : %s \n부모 폴더 : %s \n"
				, fileName, path, parent);
		System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? : %b\n폴더가 맞는가? : %b\n"
				, file.exists(),file.isFile(),file.isDirectory());
		Exam_File exFile = new Exam_File();
		exFile.folderMake();
		exFile.fileMake();
	}
	
	
	public void folderMake() {
		File folderMake = new File("src/org/ajoo/day13/file/dday");
		if(!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더 생성!");
		} else {
			System.out.println("폴더가 이미 있습니다.");			
		}
	}
	public void fileMake() {
		File fileMake = new File("src/org/ajoo/day13/file/d-day.txt");
		if(!fileMake.exists()) {
			try {
				fileMake.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("파일 생성!");
		} else {
			System.out.println("파일이 이미 있습니다.");
		}
	}

}
