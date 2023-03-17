package ineteg;
import java.net.*;

public class inet {
	
	public static void main (String [] args)
	{
		try
		{
			InetAddress i1 = InetAddress.getByName("www.facebook.com");  // getByName()-> determines ip address of give host name 
			System.out.println(i1);
			
			InetAddress i2 = InetAddress.getByName("www.ghabvxssdsb.com");
			System.out.println(i2);
			
		}catch(UnknownHostException e) // throws message if the given host name is not valid or available
		{
			System.out.println("The given domain name is unknown.");
	}
}
}
