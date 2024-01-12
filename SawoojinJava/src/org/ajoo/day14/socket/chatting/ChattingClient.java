package org.ajoo.day14.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		String address = "192.168.60.208";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("채팅 서버에 연결중...");
			Socket socket = new Socket(address, port);
			System.out.println("채팅 서버와 연결되었습니다.!");
			while(true) {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("서버와의 채팅을 시작합니다.");
				// resc
				String rescMsg = dis.readUTF();
				if("exit".equalsIgnoreCase(rescMsg)) {
					System.out.println("서버에서 종료");
					break;
				}
				System.out.printf("서버(상대) : %s\n", rescMsg);
				// /resc
				System.out.print("클라이언트 : ");
				String sendMsg = sc.nextLine();
				// send
				dos.writeUTF(sendMsg);
				dos.flush();
				if("exit".equalsIgnoreCase(sendMsg)) {
					System.out.println("종료");
					break;
				}
				// /send
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
