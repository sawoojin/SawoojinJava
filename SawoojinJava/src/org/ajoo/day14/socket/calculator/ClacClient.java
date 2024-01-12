package org.ajoo.day14.socket.calculator;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClacClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null; // 보조 스트림을 가져와서 사용
		try {
			System.out.println("서버에 연결중입니다...");
			Socket socket = new Socket(address, port);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream(); 
			dos = new DataOutputStream(os); // dos 는 os를 전달값으로 넘김
			System.out.println("서버와 연결됨");
			System.out.println();
			while(true) {
				System.out.print("계산식(빈칸으로 띄워 입력 예) 24 + 42) : ");
				String sendMsg = sc.nextLine(); 
				dos.writeUTF(sendMsg);
				dos.flush();
				if("exit".equalsIgnoreCase(sendMsg)) {
					System.out.println("종료하였습니다.");
					break;
				}
				
				String recvMsg = dis.readUTF();
				if("end".equalsIgnoreCase(recvMsg)) {
					System.out.println("형식이 잘못되었습니다. 다시 입력");
					continue;
				}
				System.out.println("계산결과 : " + recvMsg);
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
