package ineteg;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEg {

	public static void main (String [] args)
	{
		try
		{
			
			InetAddress[] i3 = InetAddress.getAllByName("www.google.com"); // getAllByName()-> gives the array of ip address of given host name
			System.out.println(i3);
			
			InetAddress[] i4 = InetAddress.getAllByName("www.sjjsdgfjerbc.com");
			System.out.println(i4);
			
		}catch(UnknownHostException e) // throws message if the given host name is not valid or available
		{
			System.out.println("The given domain name is unknown.");
	}
}
}
