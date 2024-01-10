package org.ajoo.day13.file.socket.basic;

import java.io.*;
import java.net.*;

public class SocketServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리는중...");
			Socket socket = serverSocket.accept();
			System.out.println("연결되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
