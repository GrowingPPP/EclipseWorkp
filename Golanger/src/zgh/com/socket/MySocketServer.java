package zgh.com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class MySocketServer extends Thread {
	private ServerSocket serverSocket;

	public MySocketServer(int port) {
		try {
			//开启port端口 ，等待客户端的请求，
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			serverSocket.setSoTimeout(10000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("等待远程客户端连接，端口号：" + serverSocket.getLocalPort());
			try {
				Socket server = serverSocket.accept();
				System.out.println("远程客户端地址为：" + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("我（server）收到了客户端" + server.getRemoteSocketAddress() + "的连接请求" + "\n拜拜");

				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static void main(String[] args) {
		int port = Integer.parseInt(args[0]);
		Thread t = new MySocketServer(port);
		t.run();
	}
}
