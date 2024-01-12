package org.ajoo.day14.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("서버에 연결중...");
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.!");
			System.out.println("게임 준비 완료");
			while(true) {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);				
				String recsMsg = dis.readUTF();
				System.out.println("숫자 입력(띄어쓰기로 구분)");
				System.out.print("--> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				dos.flush();
				
				String recsMsgSB = dis.readUTF();
				System.out.println(recsMsgSB);
				if("error".equalsIgnoreCase(recsMsgSB)) {
					System.out.println("다시 입력해주세요");
					continue;
				}
				if("3스트라이크 0볼".equalsIgnoreCase(recsMsgSB)) {
					System.out.println("축하합니다. 맞췄습니다.");
					break;
				}
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
