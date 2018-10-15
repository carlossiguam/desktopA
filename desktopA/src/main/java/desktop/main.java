package desktop;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

import org.apache.log4j.Logger;

import server.SockSEmov;
import test.HelloExample;

public class main {
	
	public static final Logger logero = Logger.getLogger(main.class);

	public static void main(String[] args) {
		 
//		HelloExample obj = new HelloExample();
//		obj.runMe("clsm");
		
//		int port = Integer.parseInt(args[0]);
//		try {
//			Thread t = new SockSEmov(port);
//			t.start();
//		} catch (IOException e) {
//			String messageEXC="Exist a problem";
//			logero.info(messageEXC, e);
//		}
//		
		
//		Creacion de un metodo para el testing de connection a un nodo
		try {
			Inet4Address address1 = (Inet4Address) InetAddress.getByName("8.8.8.8");
			System.out.println(address1.getHostName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.gc();
	}

}
