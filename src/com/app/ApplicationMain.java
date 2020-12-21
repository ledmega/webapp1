package com.app;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hell");
		
		String hostName = null;
		try
		{
			final InetAddress localhost = InetAddress.getLocalHost();
			hostName = localhost.getHostName();
		}
		catch (final UnknownHostException e)
		{
			hostName = "";
		}
		
		System.out.println("hostname = " + hostName); 
		
	}

}
