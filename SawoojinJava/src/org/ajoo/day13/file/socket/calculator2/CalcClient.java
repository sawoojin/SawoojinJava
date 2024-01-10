package org.ajoo.day13.file.socket.calculator2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "127.0.0.1";
		int port = 8889;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
			// 계산결과 : 66
			Socket socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다."); // 클라의 소켓이 만들어짐
//			os = new FileOutputStream(""); // 내가 직접 객체 생성해서 쓰는 것이 아니라
			os = socket.getOutputStream(); // 소켓의 출력스트림을 사용해야함.
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
			String sendMsg = sc.nextLine();
			///// 입력받은 값 바이트배열로 변환하여 보내기 /////
			dos.writeUTF(sendMsg);
			dos.flush();
//			byte [] data = sendMsg.getBytes();
//			os.write(data);
//			os.flush();
			/////////////////////////////////////////
			int recvMsg = dis.readInt();
			System.out.println("계산결과 : " + recvMsg);
//			int readByteCount;
//			data = new byte[1024];
//			readByteCount = is.read(data);
//			String recvMsg = new String(data, 0, readByteCount);
//			System.out.println("계산결과 : " + recvMsg);
			/////////////////////////////////////////
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



























