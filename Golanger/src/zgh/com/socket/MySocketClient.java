package zgh.com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MySocketClient {
	public static void main(String[] args) {
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		System.out.println("���ӵ������� ��"+serverName+",�˿ںţ�"+port);
		try {
			Socket client = new Socket(serverName, port);
			//Socket  getRemoteSocketAddress��ȡԶ��������ַ
			System.out.println("Զ�̷�������ַ��" + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			
			
			out.writeUTF("Hello from "+client.getLocalSocketAddress());
			
			InputStream  inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			
			System.out.println("��������Ӧ��"+in.readUTF());
			client.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
