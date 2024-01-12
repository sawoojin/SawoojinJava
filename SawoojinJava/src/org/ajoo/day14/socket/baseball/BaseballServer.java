package org.ajoo.day14.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.Random;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket sSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			System.out.println("서버 구동중입니다...");
			sSocket = new ServerSocket(port);
			System.out.println("서버 구동하였습니다.");
//			Thread.sleep(1500);
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = sSocket.accept();
			System.out.println("클라이언트 접속 완료");
			System.out.println("채팅이 시작되었습니다!");
			Random random = new Random();
			int randomNum1 = random.nextInt(10);
			int randomNum2 = random.nextInt(10);
			int randomNum3 = random.nextInt(10);
			String sendMsg = randomNum1 +" "+ randomNum2 +" " + randomNum3;
			System.out.println("서버 숫자 -> " + sendMsg);
			System.out.println("서버 준비 완료");
			
			while(true) {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				dos.writeUTF(sendMsg);
				dos.flush();
				String rescMsg = dis.readUTF();
				System.out.println("받기 : " + rescMsg);
				String [] input = rescMsg.split(" ");
				if(input.length != 3) {
					String errMsg = "error";
					dos.writeUTF(errMsg);
					dos.flush();
					continue;
				}
				int inputNum1 = Integer.parseInt(input[0]);
				int inputNum2 = Integer.parseInt(input[1]);
				int inputNum3 = Integer.parseInt(input[2]);
				int strike = 0;
				int ball = 0;
				if (inputNum1 == randomNum1) {
					strike += 1;
				} else if(inputNum1 == randomNum2) {
					ball += 1;
				} else if(inputNum1 == randomNum3) {
					ball += 1;
				}
				if (inputNum2 == randomNum2) {
					strike += 1;
				} else if(inputNum2 == randomNum1) {
					ball += 1;
				} else if(inputNum2 == randomNum3) {
					ball += 1;
				}
				if (inputNum3 == randomNum3) {
					strike += 1;
				} else if(inputNum3 == randomNum1) {
					ball += 1;
				} else if(inputNum3 == randomNum2) {
					ball += 1;
				}
				String sendMsgSB = strike+"스트라이크 " +ball+"볼";
				dos.writeUTF(sendMsgSB);
				dos.flush();
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					break;
				}
			}					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
