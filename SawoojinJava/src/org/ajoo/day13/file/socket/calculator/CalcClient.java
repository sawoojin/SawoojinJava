package org.ajoo.day13.file.socket.calculator;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		InputStream is = null;
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			// 소캣은 전용 메소드로 값을 넘겨야 한다.
//			os = new FileOutputStream("");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			System.out.print("계산식(빈칸으로 띄어 입력, ex) 24 + 42) : ");
			String sendMsg = sc.nextLine();
			byte [] data = sendMsg.getBytes();
			os.write(data);
			os.flush();
			// 서버 데이터 받기
			int readByteCount;
			byte [] readBytes = new byte[1024];
			String result = "";
			while((readByteCount = is.read(readBytes)) != -1) {
				result += new String(readBytes, 0, readByteCount);
			}
			System.out.println("계산결과 : " + result);
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
