package com.FirstLab;
import java.net.*;

public class AddressTypeEg {
	public static void main(String [] args)
	{
		try
		{
			InetAddress i = InetAddress.getByName("www.janabhawana.com");
			if(i.isAnyLocalAddress()) // returns true for
				{
					System.out.println("The given address "+i+" is wild card address.");
				}
			if(i.isLoopbackAddress())
				{
					System.out.println("The given address "+i+" is loopback address.");
				}
			
			if(i.isLinkLocalAddress())
				{
					System.out.println("The given address "+i+" is linklocal address.");
				}
			
			if(i.isSiteLocalAddress())
				{
					System.out.println("The given address "+i+" is sitelocal address.");
				}
			else
				{
					System.out.println("The given address "+i+" is global address.");
				}
			
			if(i.isMulticastAddress())
			{
				if(i.isMCGlobal())
					{
						System.out.println("The given address "+i+" is global multicast address.");
					}
				else if(i.isMCOrgLocal())
					{
						System.out.println("The given address "+i+" is wild multicast address.");
					}
				else if(i.isMCSiteLocal())
					{
						System.out.println("The given address "+i+" is site wild multicast address.");
					}
				else if(i.isMCLinkLocal())
					{
						System.out.println("The given address "+i+" is subnet wide multicast address.");
					}
				else if(i.isMCNodeLocal())
					{
						System.out.println("The given address "+i+" is an interface local multicast address.");
					}
				else
				{
					System.out.println("The given address "+i+" is unknown multicast address.");
				}
			}
			else
			{
				System.out.println("The given address "+i+" is unicast address.");
			}
		}catch(UnknownHostException e)
			{
				System.out.println("This is invalid address.");
			}
	}
	}

