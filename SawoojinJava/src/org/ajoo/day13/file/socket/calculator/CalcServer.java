package org.ajoo.day13.file.socket.calculator;

import java.io.*;
import java.net.*;

public class CalcServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트 연결중...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결됨");
			// 소캣은 전용 메소드로 값을 받아야 한다.
//			is = new FileInputStream("");
			is = socket.getInputStream();
			int readByteCount;
			byte [] readBytes = new byte[1024];
			String result = "";
//			while(true) {
//				readByteCount = is.read(readBytes);
//				if(readByteCount == -1) break;
//			}
			result = "66";
			os = socket.getOutputStream();
//			while((readByteCount = is.read(readBytes)) != -1) {
//				result += new String(readBytes, 0, readByteCount);
//			}
			System.out.println(result);
			byte [] data = result.getBytes();
			os.write(data);
			os.flush();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
