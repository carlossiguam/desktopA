package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import org.apache.log4j.Logger;

public class SockSEmov extends Thread{
	
	private int TIMEOUT = 10000;
	
	private ServerSocket serverSocket;
	public final Logger logero = Logger.getLogger(this.getClass());

	public SockSEmov(int port) throws IOException{
		
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(this.TIMEOUT);	
	}
	
	public void run() {
		while(true) {
			try {
				System.out.print("Waiting for client on port " +
						serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				
				System.out.println("Just connected to " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
				+ "\nGoodbye!");
				server.close();
				
				
			} catch (SocketTimeoutException s) {
				String messageTimeout = "Socket time out";
				System.out.println(messageTimeout);
				// TODO: handle exception
				logero.info(messageTimeout,s);
			}catch (IOException eio) {
				String messageIO = "Review the data of the comunication";
				System.out.println(messageIO);
				// TODO: handle exception
				logero.info(messageIO,eio);
			}
		}
	}
	
	

}
