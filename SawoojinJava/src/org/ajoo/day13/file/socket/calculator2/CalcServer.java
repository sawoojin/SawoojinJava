package org.ajoo.day13.file.socket.calculator2;

import java.net.*;
import java.io.*;

public class CalcServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		int port = 8889;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다."); // 서버의 소켓이 만들어짐
//			is = new FileInputStream(""); // 생성해서 쓰는게 아니라
			is = socket.getInputStream(); // socket 객체 내의 스트림을 사용함
			// os = new FileOutputStream(""); // 생성해서 쓰는게 아님
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			/////////////// 보낸 값 받아서 출력하기 //////////
			String recvMsg = dis.readUTF();
			
			String[] number = recvMsg.split(",");
			int num1 = Integer.parseInt(number[0]);
			int num2 = Integer.parseInt(number[1]);
			int result = num1 + num2;
			
//			int readByteCount;
//			byte [] readBytes = new byte[1024];
//			readByteCount = is.read(readBytes);
//			String result = new String(readBytes, 0, readByteCount);
//			System.out.println(result);
			/////////////////////////////////////////////
			dos.writeInt(result);
			dos.flush();
//			result = "66";
//			byte [] data = result.getBytes();
//			os.write(data);
//			os.flush();
			/////////////////////////////////////////////
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


















