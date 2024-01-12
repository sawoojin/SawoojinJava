package org.ajoo.day14.socket.calculator;

import java.io.*;
import java.net.*;


public class CalcServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리는중...");
			Socket socket = serverSocket.accept();
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream(); 
			dos = new DataOutputStream(os);
			System.out.println("클라이언트와 연결됨");
			while(true) {
				String recvMsg = dis.readUTF(); // DataInputStream은 여러 값으로 데이터 통신을 가능하게 함
				if("exit".equalsIgnoreCase(recvMsg)) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.println(recvMsg);
				String [] msgArrs = recvMsg.split(" "); // 빈칸으로 배열저장
				if(msgArrs.length != 3) {
					// 배열이 3개가 아닐 경우
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue; // 빠꾸
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				
				switch(operator) {
				// 계산 결과를 String 변환방법 2개
				case "+" : result = num1 + num2 + ""; break;
				case "-" : result = num1 - num2 + ""; break;
				case "*" : result = String.valueOf(num1 * num2); break;
				case "/" : result = num1 / num2 + ""; break;
				case "%" : result = num1 % num2 + ""; break;
				}
				dos.writeUTF(result);
				dos.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

