package org.ajoo.day14.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket sSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("채팅 서버를 구동중입니다...");
			sSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다.");
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = sSocket.accept();
			System.out.println("클라이언트와 접속 완료");
			while(true) {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("채팅이 시작되었습니다!");
				System.out.print("서버 (나) : ");
				String sendMsg = sc.nextLine();
				// send
				dos.writeUTF(sendMsg);
				dos.flush();
				if("exit".equalsIgnoreCase(sendMsg)) {
					System.out.println("종료");
					break;
				}
				// /send
				// resc
				String rescMsg = dis.readUTF();
				if("exit".equalsIgnoreCase(rescMsg)) {
					System.out.println("클라이언트에서 종료");
					break;
				}
				System.out.printf("클라이언트 : %s\n", rescMsg);
				// /resc
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
