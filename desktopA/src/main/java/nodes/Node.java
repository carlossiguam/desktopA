package nodes;

import java.net.Inet4Address;

public class Node {
	
	private String nombre;
	private String alias;
	private String ipAddress;
	
	private Inet4Address ip4address;
	
	
	
	
	public Node(String nombre, String alias, String ipAddress) {
		super();
		this.nombre = nombre;
		this.alias = alias;
		this.ipAddress = ipAddress;
	}
	
	public Inet4Address getIp4address() {
		return ip4address;
	}

	public void setIp4address(Inet4Address ip4address) {
		this.ip4address = ip4address;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	
	public  boolean isConnected() {
		return true;
	}
	
	

}
