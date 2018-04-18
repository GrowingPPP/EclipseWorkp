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
			//����port�˿� ���ȴ��ͻ��˵�����
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
			System.out.println("�ȴ�Զ�̿ͻ������ӣ��˿ںţ�" + serverSocket.getLocalPort());
			try {
				Socket server = serverSocket.accept();
				System.out.println("Զ�̿ͻ��˵�ַΪ��" + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("�ң�server���յ��˿ͻ���" + server.getRemoteSocketAddress() + "����������" + "\n�ݰ�");

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
