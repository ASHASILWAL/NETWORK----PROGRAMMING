package com.FirstLab;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.*;
public class GetNetworkInterfaceEg {

	public static void main(String[] args )throws SocketException {
		// TODO Auto-generated method stub
		
			Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
			// getNetworkInterfaces() -> returns a java.util.Enumeration listing all the network interfaces on local host
			while(en.hasMoreElements())
			{
				NetworkInterface net = en.nextElement();
						System.out.println(net);
			}

	}


}
